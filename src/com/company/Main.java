package com.company;

public class Main {

    public static void main(String[] args) {
	String str = "О, лета тело!";
	str = str.toLowerCase();
        str = str.replaceAll(" " ,"");
	str = str.replaceAll("\\," ,"");
        str = str.replaceAll("\\!" ,"");
        str = str.replaceAll("\\-" ,"");
	boolean isPalindrom = true;
	String reverce = "";
        for (int i = 0; i < str.length(); i++) {
            reverce += str.charAt(str.length() - 1 - i);
        }
        System.out.println(reverce);
        if (str.equals(reverce)){
            System.out.println("Palindrom ok");
        }
        else System.out.println("Palindrom no ok");
    }
}
