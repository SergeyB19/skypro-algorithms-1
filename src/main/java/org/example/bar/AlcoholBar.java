package org.example.bar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AlcoholBar {
    Set<Integer> passports = new HashSet<>();
    public String acceptVisitor(Person visitor) {
        if (visitor.getAge() >= 18) {
            if (passports.contains(visitor.getPassport())) {
                return "Please wait " + visitor.getName() + ", help is on the way";
            }
            passports.add(visitor.getPassport());
            return "Come in " + visitor.getName();
        } else {
            return "You're too young, " + visitor.getName() + ". Go home " + visitor.getName();
        }

    }
}
