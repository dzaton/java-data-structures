package com.dzaton.DSA.TheMaps;

import com.dzaton.DTO.Person;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {

    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1,new Person("Alex",25));
        map.put(2,new Person("Maria",15));
        map.put(3,new Person("Pepe",55));
        //Si insertamos un objeto con un indice ya existente en el map, sobreescribirmos el registro antiguo con los datos del nuevo
        map.put(3,new Person("Pepe 2",55));

        System.out.println(map);
        System.out.println("Tamaño "+map.size());

        Person persona1 = map.get(1);
        System.out.println("Primer elemento (índice = 1): "+persona1);

        System.out.println("¿Contiene el elemento 4? " +map.containsKey(4));
        System.out.println("¿Contiene la persona Carmen? " +map.containsValue(new Person("Carmen",25)));
        System.out.println("Los indices son: "+map.keySet()); //Es un Set porque no puede haber keys duplicadas
        System.out.println("Los valores son: "+map.values());
        System.out.println("El Set del mapa es: "+map.entrySet());
        map.remove(3);

        System.out.println(map.getOrDefault(3,new Person("Default",0)));

        System.out.println("\nFormas de recorrer un map");
        map.entrySet().forEach(x -> System.out.println(x.getKey()+ " " +x.getValue()));


        map.forEach((key,person) -> {
            System.out.println(key + " - " + person);
        });





    }
}
