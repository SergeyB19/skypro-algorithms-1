package org.example.bar;

public class Main {
    public static void main(String[] args) {
        Person sarah = new Person("Sarah", 30, 12345);

        AlcoholBar alcoholBar = new AlcoholBar();
        System.out.println(alcoholBar.acceptVisitor(sarah));

        Person john = new Person("John", 13, 2345);
        System.out.println(alcoholBar.acceptVisitor(john));
        System.out.println(alcoholBar.acceptVisitor(sarah));
    }
}
