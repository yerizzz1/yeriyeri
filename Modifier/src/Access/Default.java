/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access;

/**
 *
 * @author rosinaribka
 */
public class Default {
  String fname = "Yerico Armi Nanlohy";
  String lname = "yeri";
  String email = "yericonanlohy@gmail.com";
  int age = 20;
  
  public static void main(String[] args) {
    Default myObj = new Default();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
}
}