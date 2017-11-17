/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package label;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Spark
 */
public class LabelHandler {
     public static ArrayList<Has> getHas(Connection conn) {
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Has");
            ArrayList<Has> has = new ArrayList<>();
            while (rs.next()) {
                has.add(new Has(rs.getInt("label_id") , rs.getInt("album_id") , rs.getInt("song_id")));
            }
            return has;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Labels> getLabels(Connection conn) {
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Labels");
            ArrayList<Labels> labels = new ArrayList<>();
            while (rs.next()) {
                labels.add(new Labels(rs.getInt("label_id") , rs.getString("label_name")));
            }
            return labels;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
