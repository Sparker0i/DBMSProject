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
public class Person {
    public int person_id;
    public String name;
    public String house_name;
    public String address;
    public int zipcode;
    public String area;
    
    public Person(int person_id , String name , String house_name , String address , int zipcode, String area) {
        this.person_id = person_id;
        this.name = name;
        this.house_name = house_name;
        this.address = address;
        this.zipcode = zipcode;
        this.area = area;
    }
}
