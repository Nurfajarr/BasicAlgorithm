package com.modul.oop.inheritance;

public class Child extends Parent {

    String ortu;

    public void iniOrtu(String ortu){
        System.out.println("Mama saya : " + ortu + "Ayah saya : " + this.ortu );
    }
}
