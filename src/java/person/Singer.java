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
public class Singer {
    public int person_id;
    public String contracted;
    public String name;
    
    public Singer(int person_id , String name , String contracted) {
        this.person_id = person_id;
        this.name = name;
        this.contracted = contracted;
    }
}
