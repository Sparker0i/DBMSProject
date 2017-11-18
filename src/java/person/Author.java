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
    public String cname; //company
    public String name;
    
    public Author(int person_id , String name, String cname) {
        this.cname = cname;
        this.name = name;
        this.person_id = person_id;
    }
}
