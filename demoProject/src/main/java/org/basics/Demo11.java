package org.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Capgemini","Accenture","TCS","EPAM");
        Collections.sort(list);
        System.out.println(list);
    }
}
