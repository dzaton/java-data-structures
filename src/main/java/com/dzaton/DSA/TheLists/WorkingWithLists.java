package com.dzaton.DSA.TheLists;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

        List<String> listInmutable = List.of(
                "hola","adiós"
        );
        //Si creamos una lista de la forma anterior no se podrá modificar: listInmutable.add("buenos días");
        List<String> colors=new ArrayList<>();

        colors.add("azul");
        colors.add("morado");
        colors.add("amarillo");
        System.out.println(colors);
        System.out.println("Tamaño de la lista: " + colors.size());
        System.out.println(colors.contains("amarillo"));
        System.out.println(colors.contains("dinosaurio"));

        for (String color: colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }


}

