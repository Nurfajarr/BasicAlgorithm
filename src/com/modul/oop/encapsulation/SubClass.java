package com.modul.oop.encapsulation;

public class SubClass {

    protected String name = "Fajar";
    protected int age = 21;

    public void getName(){
        System.out.println("Nama saya adalah : " + name);
    }

    void getAge(){
        System.out.println("Saya berumur : " + age + " Tahun");
    }

}
