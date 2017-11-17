/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Spark
 */
public class MusicHandler {
    public static ArrayList<Album> getAlbums(Connection conn) {
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Album");
            ArrayList<Album> albums = new ArrayList<>();
            while (rs.next()) {
                albums.add(new Album(rs.getInt("album_id") , rs.getString("title") , rs.getDate("copyright_date") , rs.getString("format")));
            }
            return albums;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Song> getSongs(Connection conn) {
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Song");
            ArrayList<Song> songs = new ArrayList<>();
            while (rs.next()) {
                songs.add(new Song(rs.getInt("song_id") , rs.getString("title") , rs.getInt("author_id")));
            }
            return songs;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Contains> getContains(Connection conn , String i) {
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT Album.TITLE AS Album_Title, Song.TITLE AS Song_Title FROM CONTAINS INNER JOIN Album ON Album.Album_Id = Contains.Album_Id INNER JOIN Song ON Song.Song_Id = Contains.Song_Id WHERE Album.Album_Id = " + i);
            ArrayList<Contains> contains = new ArrayList<>();
            while (rs.next()) {
                contains.add(new Contains(rs.getString("album_title") , rs.getString("song_title")));
            }
            return contains;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Sings> getSings(Connection conn) {
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Sings");
            ArrayList<Sings> sings = new ArrayList<>();
            while (rs.next()) {
                sings.add(new Sings(rs.getInt("singer_id") , rs.getInt("song_id")));
            }
            return sings;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Composes> getComposes(Connection conn) {
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Composes");
            ArrayList<Composes> composes = new ArrayList<>();
            while (rs.next()) {
                composes.add(new Composes(rs.getInt("director_id") , rs.getInt("album_id")));
            }
            return composes;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
