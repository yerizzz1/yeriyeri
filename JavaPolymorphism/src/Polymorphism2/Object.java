/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism2;

/**
 *
 * @author rosinaribka
 */
public class Objects {
public void ObjectsSound() {
    System.out.println("The Objects sound");
    System.out.println("=================");
  }
}

class Bell extends Objects {
  public void ObjectsSound() {
    System.out.println("Suaranya Bell : Kriiiinngggg");
  }
}

class Angin extends Objects {
  public void ObjectsSound() {
    System.out.println("Suaranya Kipas Angin : Wusssshhh");
  }
}

class Telepon extends Objects {
  public void ObjectsSound() {
    System.out.println("Suaranya Telepon : Triingg triing triing");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Objects myObjects = new Objects();
    Objects myBell = new Bell();
    Objects myAngin = new Angin();
    Objects myTelepon = new Telepon();
        
    myObjects.ObjectsSound();
    myBell.ObjectsSound();
    myAngin.ObjectsSound();
    myTelepon.ObjectsSound();
  }
}
