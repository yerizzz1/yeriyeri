/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

/**
 *
 * @author rosinaribka
 */
interface SuaraHewan {
  public void SuaraHewan(); // interface method (does not have a body)
  public void Awake(); // interface method (does not have a body)
}

class Dog implements SuaraHewan {
  public void SuaraHewan() {
    System.out.println("Anjing Kalo Bangun: Guugk guuk guugk");
  }
  public void Awake() {
    System.out.println("Gggrrrr!!");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.SuaraHewan();
    myDog.Awake();
  }
}
