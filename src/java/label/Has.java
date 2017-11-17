/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package label;

/**
 *
 * @author Spark
 */
public class Has {
    public int label_id;
    public int album_id;
    public int song_id;
    
    public Has(int label_id , int album_id , int song_id) {
        this.label_id = label_id;
        this.album_id = album_id;
        this.song_id = song_id;
    }
}
