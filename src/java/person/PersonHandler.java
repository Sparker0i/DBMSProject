/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Spark
 */
public class PersonHandler {
    public static ArrayList<Author> getAuthors(Connection conn) {
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Author INNER JOIN Person ON Person.Person_Id = Author.person_id;");
            ArrayList<Author> authors = new ArrayList<>();
            while (rs.next()) {
                authors.add(new Author(rs.getInt("person_id") , rs.getString("name") , rs.getString("cname")));
            }
            return authors;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<MusicDirector> getMusicDirectors(Connection conn) {
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Music_Director INNER JOIN Person ON Person.Person_Id = Music_Director.person_id;");
            ArrayList<MusicDirector> musicdirectors = new ArrayList<>();
            while (rs.next()) {
                musicdirectors.add(new MusicDirector(rs.getInt("person_id") , rs.getString("name") , rs.getString("company")));
            }
            return musicdirectors;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Singer> getSingers(Connection conn) {
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * , Person.NAME FROM Singer INNER JOIN Person ON Person.Person_Id = Singer.Person_Id; ");
            ArrayList<Singer> singers = new ArrayList<>();
            while (rs.next()) {
                singers.add(new Singer(rs.getInt("person_id") , rs.getString("name") , rs.getString("contracted")));
            }
            return singers;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static NewSinger getSinger(Connection conn , String id) {
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Person NATURAL JOIN Zip NATURAL JOIN City WHERE Person_Id = " + id);
            while (rs.next()) {
                return new NewSinger(rs.getString("city") , rs.getString("area") , rs.getString("name") , rs.getString("house_name") , rs.getString("address") , rs.getString("state") , rs.getString("country") , rs.getInt("zipcode") , rs.getInt("person_id"));
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Person> getPersons(Connection conn) {
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Person");
            ArrayList<Person> persons = new ArrayList<>();
            while (rs.next()) {
                persons.add(new Person(rs.getInt("person_id") , rs.getString("name") , rs.getString("house_name") , rs.getString("address") , rs.getInt("zipcode") , rs.getString("area")));
            }
            return persons;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
