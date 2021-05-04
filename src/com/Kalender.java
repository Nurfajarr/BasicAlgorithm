package com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Kalender {

    public static void main(String[] args){
        long date = 1620137527;
        Date d = new Date(date * 1000);
        String sa = new SimpleDateFormat("yyyy-MM-dd").format(d);
        Date date1 = java.sql.Date.valueOf(sa);
        System.out.println(date1);

    }
}
