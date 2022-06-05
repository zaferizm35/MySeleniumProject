package com.cydeo.zafer;

public class Bracet {
    public static void main(String[] args) {
        String name = "{{[[]}}";
        String reverseName =" ";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseName+=name.charAt(i);
        }
        System.out.println(reverseName);
    if(name.length()%2!=0) {
        if(name.equals(reverseName)) {
            System.out.println(" balanced");
        }
        else{
            System.out.println(" not balanced");
        }

    } else {
        System.out.println(" not balanced");

    }
    }

}
