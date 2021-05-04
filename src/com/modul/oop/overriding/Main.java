package com.modul.oop.overriding;

//overriding adalah mendeklarasikan ulang method parent di child
public class Main {

    public static void main(String args[]){

        Parent parent = new Parent();
        parent.sayHai();

        Child child = new Child();
        child.sayHai();

    }

}
