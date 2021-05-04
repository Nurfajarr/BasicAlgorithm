package com.modul.oop.inheritance;

import com.modul.oop.encapsulation.SubClass;

public class Main {

    public static void main(String args[]){

        //objek dari induk
        Parent parent = new Parent();
        parent.id = 1;
        parent.nama = "Fajar";
        parent.umur = 21;

        parent.iniId(11);
        parent.iniNama("Nur");
        parent.iniUmur(22);

        //objek dr anak
        Child child = new Child();
        child.id = 2;
        child.nama = "Toni";
        child.umur = 12;
        child.ortu = "Karim";

        child.iniId(22);
        child.iniNama("Kros");
        child.iniUmur(13);
        child.iniOrtu("Kazami");

    }
}
