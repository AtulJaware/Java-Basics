package org.basics;

public class CamelCase {
    public static void main(String[] args) {
        String s="atul jaware patil";
        System.out.println(s);
        // First Logic
        StringBuilder camel= new StringBuilder();
        boolean flag=false;
        camel.append(Character.toUpperCase(s.charAt(0)));
        for (int i=1;i<s.length();i++){
            if(s.charAt(i)==' '){
                flag=true;
            } else if (flag) {
                camel.append(Character.toUpperCase(s.charAt(i)));
                flag=false;
            }
            else {
                camel.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(camel);

        // 2nd logic
       s =s.substring(0,1).toUpperCase()+s.substring(1);
        StringBuilder builder =new StringBuilder(s);

        for(int i=0;i<builder.length();i++){
            if(builder.charAt(i)==' '){
                builder.deleteCharAt(i);
                builder.replace(i,i+1,
                        String.valueOf(Character.toUpperCase(builder.charAt(i))));
            }
        }
        System.out.println(builder);
    }
}