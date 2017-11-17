/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music;

import java.util.Date;

/**
 *
 * @author Spark
 */
public class Album {
    public int album_id;
    public String title;
    public Date date;
    public String format;
    
    public Album(int album_id, String title, Date date, String format) {
        this.album_id = album_id;
        this.title = title;
        this.date = date;
        this.format = format;
    }
}
