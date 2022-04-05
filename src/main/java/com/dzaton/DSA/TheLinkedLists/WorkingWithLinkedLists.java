package com.dzaton.DSA.TheLinkedLists;

import com.dzaton.DTO.Person;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedLists {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<Person>();

        linkedList.add(new Person("Alex", 35));
        linkedList.add(new Person("Maria", 25));
        linkedList.addFirst(new Person("Rebeca",50));
        linkedList.addLast(new Person("Juan",23));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        System.out.println("Iterar una LinkedList con next()");
        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println("Ahora con previous()");
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

        System.out.println(linkedList);
    }
}
