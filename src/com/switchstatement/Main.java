package com.switchstatement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nilai;

        System.out.print("Masukan nilai : ");
        Scanner input = new Scanner(System.in);
        nilai = input.nextInt();

        switch (nilai){
            case 100 :
                System.out.println("Cumlaude");
                break;
            case 90 :
                System.out.println("Sangat baik");
                break;
            case 80 :
                System.out.println("Baik");
                break;
            case 70 :
                System.out.println("Cukup");
                break;
                case 50 :
                    System.out.println("Anda tidak lulus");
                    break;
                    default:
                        System.out.println("Remedial");
        }

    }

}
