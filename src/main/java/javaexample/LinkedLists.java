package javaexample;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> months = new LinkedList<String>();
        months.add("Jaruary");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.remove("May");
        for (String i: months){
            System.out.println(months);
        }

    }
}