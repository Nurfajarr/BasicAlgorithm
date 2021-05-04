package com.tipedata;

public class Array {

    public static void main(String[] args) {

        String[] objek;

        objek = new String[3];
        objek[0] = "Nurfajar";
        objek[1] = "Sedang Belajar";
        objek[2] = "Tipe Data Array";

        System.out.println(objek[0]);
        System.out.println(objek[1]);
        System.out.println(objek[2]);

        int[] iniInt = new int[]{
          04,11,1999
        };

        System.out.println(iniInt[0]);
        System.out.println(iniInt[1]);
        System.out.println(iniInt[2]);

        long[] iniLong ={
          22,11,33
        };

        iniLong[2]=10;

        System.out.println(iniLong[0]);
        System.out.println(iniLong[1]);
        System.out.println(iniLong[2]);
        System.out.println(iniLong.length);

        //array di dalam array
        String[][] obj = {
                {"hai", "aku", "fajar"},
                {"kamu", "siapa"},
                {"hallo"}
        };

        System.out.println(obj[0][2]);

    }

}
