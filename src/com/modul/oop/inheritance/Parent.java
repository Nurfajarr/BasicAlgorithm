package com.modul.oop.inheritance;

public class Parent {

    int id;
    String nama;
    int umur;

    public void iniId(int id){
        System.out.println("id : " + id + "menjadi "+ this.id);
    }

    public void iniNama(String nama){
        System.out.println("Nama-1 : " + nama + "Nama-2 : " + this.nama);
    }

    public void iniUmur(int umur){
        System.out.println("Umur ku : " + umur + "Menjadi " + this.umur);
    }
}
