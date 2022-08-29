package org.example.arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, null};
        for (int i = 0; i < integers.length; i++) {
            System.out.println("integers[i] = " + integers[i]);
        }
        int i = 0;
        while (integers[i] != null) {
            System.out.println("integers[i] = " + integers[i]);
            i++;
        }

        for (int j = i-1; j>=0; j--) {
            System.out.println("integers[j] = " + integers[j]);
        }

        for (int j = integers.length-1; j>=0; j--) {
            System.out.println("integers[j] = " + integers[j]);
        }



    }
}
