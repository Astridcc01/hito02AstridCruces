package com.cuestion3;

class Animal {
  public void sonido() {
    System.out.println("Grr...");
  }
}
class Gato extends Animal {
  public void sonido() {
    System.out.println("Meow");
  }
}
class Perro extends Animal {
  public void sonido() {
    System.out.println("Woof");
  }
}