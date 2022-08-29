package org.example.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(46);
        list.add(100);
        list.add(34);
        list.add(55);
        System.out.println(list);
        list.contains(4);
        list.get(0);
    }
}
