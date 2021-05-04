package com.modul.oop.overloading;

//overloading adalah membuat method baru dengan nama yg sama tetapi parameternya berbeda
public class Main {

    public static void main(String args[]){

        Parent parent = new Parent();
        parent.detail("Nurfajar");
        parent.detail("Nurfajar", "Tangerang");
        parent.detail("Nurfajar", "Tangerang", "Pria");

        Child child = new Child();
        child.detail("Cut Syifa");
        child.detail("Cut Syifa", "Aceh");
        child.detail("Cut Syifa", "Aceh", "Wanita");

    }

}
