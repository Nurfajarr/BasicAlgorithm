package com.program.algorithm;

import java.util.Scanner;

public class SumAlgorithm {

    //deklarasi var awal
    private static Integer sum = 0;

    public  static void main(String args[]){

        //panggil function startApp
        startApp(0);
    }

    public static void startApp(Integer n){

        //deklarasi variabel input jumlah angka
        System.out.print("Masukan Angka : ");
        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        //looping jumlah inputan
        for (int a = 1; a<=n; a++){

            //proses penjumlahan
            sum +=a;
        }

        //print jumlah
        System.out.print("Sum = "+sum);
    }
}
