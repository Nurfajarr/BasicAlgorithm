package com.com.oop.overloading;

public class MainOverloading {

    public static void main(String args[]){

        Penjumlahan objek = new Penjumlahan();
        objek.tambah(5, 5);
        objek.tambah(5, 5, 5);
        objek.tambah(5.2, 5.5);
    }
}
