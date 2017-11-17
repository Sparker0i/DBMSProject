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
public class Author {
    public int person_id;
    public String name; //company
    
    public Author(int person_id , String name) {
        this.name = name;
        this.person_id = person_id;
    }
}
