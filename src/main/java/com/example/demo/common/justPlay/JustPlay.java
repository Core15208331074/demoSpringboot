package com.example.demo.common.justPlay;

import java.util.Random;

public class JustPlay {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 56; i++) {
            int left = random.nextInt(51)+90;
            int right = random.nextInt(31)+60;
            System.out.println(left+"/"+right+"   ");
        }

    }
}
