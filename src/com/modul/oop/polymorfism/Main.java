package com.modul.oop.polymorfism;

//poimorfisme adalah kemampuan object berubah bentuk menjadi bentuk lain
public class Main {

    public static void main(String args[]){

        Parent objek = new Parent();
        objek.sayHello();

        objek = new ChildSatu();
        objek.sayHello();

        objek = new ChildDua();
        objek.sayHello();

    }

}
