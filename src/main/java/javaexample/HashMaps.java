package javaexample;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> p = new HashMap<String, Integer>();
        p.put("Craig", 1);
        p.put("David", 5);
        p.put("Frank", 10);
        System.out.println(p.get("David"));
    }
}



