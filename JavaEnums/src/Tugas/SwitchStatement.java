/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author rosinaribka
 */
enum Day {
    Newyear,
    iedmubarak,
    MerryChristmast
  }
public class SwitchStatement {
public static void main(String[] args) {
    Day myVar = Day.iedmubarak; 
                
    switch(myVar) {
      case Newyear:
        System.out.println("Happy New year");
        break;
      case iedmubarak:
        System.out.println("Happy Ied Mubarak");
        break;
      case MerryChristmast:
        System.out.println("Merry Christmast");
        break;
    }
  }    
}
