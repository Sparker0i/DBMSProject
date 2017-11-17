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
public class Song {
    public int song_id;
    public String title;
    public int author_id;
    
    public Song(int song_id , String title, int author_id) {
        this.song_id = song_id;
        this.title = title;
        this.author_id = author_id;
    }
}
