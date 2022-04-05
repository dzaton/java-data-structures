package com.dzaton.DSA.TheSets;

//import com.dzaton.DTO.Ball; Importar para ver las diferencias entre objeto y record.
import com.dzaton.Model.Ball;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Los Sets no contienen duplicados ni orden especifico.
 */
public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();

        balls.add(new Ball("Rojo"));
        balls.add(new Ball("Rojo"));
        balls.add(new Ball("Azúl"));
        balls.add(new Ball("Verde"));
        balls.remove(new Ball("Verde"));

        System.out.println(balls.size());

        balls.forEach(System.out::println);
    }

}
