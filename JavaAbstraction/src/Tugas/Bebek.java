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
abstract class Bebek {
  public abstract void BebekSound();
  public void sleep() {
    System.out.println("kwak kwak kwak");
  }
}
class Dog extends Bebek {
  public void BebekSound() {
    System.out.println("The bebek says: kwaak kwaak");
  }
}
abstract class Bebekku { 
public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.BebekSound();
    myDog.sleep();
  }    
}