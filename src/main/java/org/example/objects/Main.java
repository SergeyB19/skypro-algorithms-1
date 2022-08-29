package org.example.objects;

import org.example.objects.Brick;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Brick brick = new Brick();
        brick.weight = 20;
        System.out.println(brick.weight);
        Brick[] bricks = new Brick[12];
        int[] ints = new int[12];
    }
}