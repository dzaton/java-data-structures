package com.dzaton.DSA.TheMaps;

import com.dzaton.Model.Ball;
import com.dzaton.Model.Person;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithHashCode {
    public static void main(String[] args) {
        Map<Person, Ball> map = new HashMap<>();
        map.put(new Person("Lidia",28), new Ball("Roja"));

        System.out.println("Prueba a comentar los metodos de hashCode e equals() en Model.Person para ver el cambio");
        System.out.println(new Person("Lidia",28).hashCode());
        System.out.println(new Person("Lidia",28).hashCode());

        System.out.println();
        System.out.println(map.get(new Person("Lidia",28)));
    }
}
