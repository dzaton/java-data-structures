package com.dzaton.DSA.TheStacks;

import java.util.Stack;

/**
 * LIFO: last in first out
 */
public class WorkingWithStacks {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        //stack.
        stack.push(1);
        stack.push(2);
        stack.push(3);

        for (int n: stack){
            System.out.println(n);
        }

        System.out.println("Devuelve el elemento superior (el último en entrar) del stack: "+stack.peek());
        System.out.println("El tamaño del stack: "+stack.size());
        System.out.println("Pop devuleve y elimina el peek del stack: " + stack.pop());
        System.out.println("El tamaño del stack: "+stack.size());
        System.out.println("¿Está vacio el stack? "+stack.empty());
    }
}
