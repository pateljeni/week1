/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author jenip
 */
public class list {
    public static void main(String[] args)
    {
    Student s1 = new Student();
    s1.setName("jeni");
    s1.setID(1234);
    
    System.out.println("Name:" + s1.getName() + " ID: " + s1.getID() );
    }
    
}
