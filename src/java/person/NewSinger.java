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
public class NewSinger {
    public String city , area , name , house_name , address , state , country;
    public int zip , person_id;
    
    public NewSinger(String city , String area , String name , String house_name , String address, String state, String country, int zip , int person_id) {
        this.city = city;
        this.area = area;
        this.name = name;
        this.house_name = house_name;
        this.address = address;
        this.state = state;
        this.country = country;
        this.zip = zip;
        this.person_id = person_id;
    }
}
