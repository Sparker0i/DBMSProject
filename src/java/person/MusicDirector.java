/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Spark
 */
public class MusicDirector {
    public int person_id;
    public String company;
    public String name;
    
    public MusicDirector(int person_id , String name , String company) {
        this.person_id = person_id;
        this.name = name;
        this.company = company;
    }
}
