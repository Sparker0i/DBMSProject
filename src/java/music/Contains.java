/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music;

/**
 *
 * @author Spark
 */
public class Contains {
    public String album_title;
    public String song_title;
    
    public Contains (String album_id , String song_id) {
        this.album_title = album_id;
        this.song_title = song_id;
    }
}
