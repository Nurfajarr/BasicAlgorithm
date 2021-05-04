package com.com.oop.overloading;

//overloading adalah banyak bentuk method tetapi memiliki parameter yg berbeda
public class Penjumlahan {

    int hasil;
    double hasill;

    public int tambah(int angka1, int angka2){
        hasil = angka1 + angka2;
        System.out.println(hasil);
        return hasil;
    }

    public int tambah(int angka1, int angka2, int angka3){
        hasil = angka1 + angka2 + angka3;
        System.out.println(hasil);
        return hasil;
    }

    public double tambah(double angka1, double angka2){
        hasill = angka1 + angka2;
        System.out.println(hasill);
        return hasill;
    }
}
