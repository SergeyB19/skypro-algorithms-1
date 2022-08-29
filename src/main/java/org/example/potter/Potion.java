package org.example.potter;

public class Potion {
    private final String name;

    public Potion(String name) {
        this.name = name;
    }
    public Potion(Potion sourse) {
        this.name = sourse.name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object other) {
        if (!other.getClass().equals(this.getClass())) {
            return false;
        }
        return ((Potion) other).name.equals(name);
    }
}
