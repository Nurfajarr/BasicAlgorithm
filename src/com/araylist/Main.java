package com.araylist;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){

        //deklarasi arraylist
        //array list : add(tambah), remove(hapus), set(mengubah), size(ukuran), get(mengambil)
        ArrayList object = new ArrayList<>();

        //add data
        object.add("Aceh");
        object.add(4);
        object.add("November");
        object.add(1999);

        //menampilkan data
        System.out.println("Data tambah :");
        System.out.println(object + "\n");

        //update
        object.set(1, 10);
        System.out.println("Data update :");
        System.out.println(object + "\n");

        //remove
        object.remove(2);
        System.out.println("Data di hapus :");
        System.out.println(object + "\n");

        //size arraylist
        System.out.println("Size : "+ object.size() + "\n");

        //get arraylist
        System.out.println("Data get : " + object.get(0));

    }
}
