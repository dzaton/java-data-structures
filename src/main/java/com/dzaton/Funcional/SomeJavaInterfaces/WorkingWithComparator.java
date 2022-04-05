package com.dzaton.Funcional.SomeJavaInterfaces;

import java.util.TreeSet;

public class WorkingWithComparator {
    public static void main(String[] args) {
        comparatorExample();

    }

    private static void comparatorExample()
    {
        var tree = new TreeSet<>(WorkingWithComparator::compare);
        tree.add(4);
        tree.add(8);
        tree.add(1);
        tree.add(4);
        tree.add(8);
        tree.add(1);
        tree.forEach(System.out::println);
    }

    private static int compare(Integer a, Integer b) {
        return b.compareTo(a);

        /**
         *         if (a < b) {
         *             return 1;
         *         }
         *         if (a == b){
         *             return 0;
         *         }
         *         return -1;
         */
    }
}
