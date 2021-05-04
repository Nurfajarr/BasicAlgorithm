package com.modul.oop.overloading;

public class Parent {

    public void detail(String name){
        System.out.println("Nama lengkap : " + name);
    }

    public void detail(String name, String alamat){
        System.out.println("Nama ku : " + name + " Alamat : " + alamat);
    }

    public void detail(String name, String alamat, String gender){
        System.out.println("Nama ku : " + name + " Alamat : " + alamat + " Jenis Kelamin : " + gender);
    }
}
