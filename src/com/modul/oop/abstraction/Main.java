package com.modul.oop.abstraction;

public class Main {

    public static void main(String args[]){

     //   Parent parent = new Parent(); -> akan error,karena class abstract tdk bisa di akses objek nya
        Child objek = new Child();
        objek.name = "Fajar";

     //   get method abstract
        objek.alamat();

        System.out.println("Nama : " + objek.name);

    }

}
