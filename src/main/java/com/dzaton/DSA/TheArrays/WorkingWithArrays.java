package com.dzaton.DSA.TheArrays;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];

        colors[0] = "morado";
        colors[1] = "azúl";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);

        colors[2] = "amarillo";

        System.out.println(Arrays.toString(colors));

        int[] numbers = {100, 200};

        for(int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        System.out.println(colors.length);

        for (String color: colors){
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);


    }
}
