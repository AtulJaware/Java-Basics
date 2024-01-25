package org.date_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        String d= "21/08/2006";
        String curr="15/12/2020";

        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
       try {
           Date dd= df.parse(d);
           Date ddd= df.parse(curr);
           long l= ddd.getTime()-dd.getTime();
           c.setTimeInMillis(l);
           int year=c.get(Calendar.YEAR)-1970;
           System.out.println(year);
       }
       catch (Exception e){
           System.out.println("Exception in parsing");
       }



    }
}
