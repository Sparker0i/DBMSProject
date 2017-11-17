/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Spark
 */
public class AddressHandler {
    public static ArrayList<City> getCities(Connection conn) {
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM City");
            ArrayList<City> cities = new ArrayList<>();
            while (rs.next()) {
                cities.add(new City(rs.getString("city") , rs.getString("state") , rs.getString("country")));
            }
            return cities;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Zip> getZips(Connection conn) {
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Zip");
            ArrayList<Zip> zips = new ArrayList<>();
            while (rs.next()) {
                zips.add(new Zip(rs.getInt("zipcode") , rs.getString("area") , rs.getString("city")));
            }
            return zips;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
