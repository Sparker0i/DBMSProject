/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

/**
 *
 * @author Spark
 */
public class Zip {
    public int zipcode;
    public String area;
    public String city;
    
    public Zip(int zipcode, String area , String city) {
        this.zipcode = zipcode;
        this.area = area;
        this.city = city;
    }
}
