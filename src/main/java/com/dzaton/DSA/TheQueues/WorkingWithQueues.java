package com.dzaton.DSA.TheQueues;

import java.util.LinkedList;
import java.util.Queue;
import com.dzaton.DTO.Person;

/**
 * FIFO: firsts in first out
 * Ej: impresora, cola supermercado, etc.
 */
public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> supermercado = new LinkedList<>();
        supermercado.add(new Person("Alex",21));
        supermercado.add(new Person("Maria",18));
        supermercado.add(new Person("Paco",45));

        for (Person p: supermercado){
            System.out.println(p.toString());
        }

        System.out.println(supermercado.size());
        System.out.println("Devuelve el primer elemento del queue: " + supermercado.peek());
        System.out.println(supermercado.poll());
        System.out.println(supermercado.size());
        System.out.println(supermercado.peek());
        System.out.println(supermercado.poll());
        System.out.println(supermercado.peek());
        System.out.println(supermercado.poll());
        System.out.println("Cuando no quedan más elementos peek() devuelve null: " +supermercado.peek());
        System.out.println("Cuando no quedan más elementos poll() devuelve null: " +supermercado.poll());
    }
}
