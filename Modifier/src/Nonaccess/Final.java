/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nonaccess;

/**
 *
 * @author rosinaribka
 */
public class Final {
final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    Final myObj = new Final();
    //myObj.x = 50; // will generate an error: cannot assign a value to a final variable
    //myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }    
}
