package com.company.set;

import java.util.HashSet;
import java.util.Iterator;


public class HS{
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Mumbai");
        hashSet.add("Thane");
        hashSet.add("Raigad");
        hashSet.add("Ratanagiri");
        hashSet.add("Sindudurg");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            if (s.equals("Thane")){
                iterator.remove();
            }
        }
        for (String s: hashSet
             ) {
            System.out.println(s);

        }

    }

}
