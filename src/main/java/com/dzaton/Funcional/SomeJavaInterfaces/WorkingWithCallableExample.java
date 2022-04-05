package com.dzaton.Funcional.SomeJavaInterfaces;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.concurrent.*;

public class WorkingWithCallableExample {

    public static void main(String[] args)
    {
        callableExample();
    }

    /**
     *Creamos un hilo y trabajamos con future, cuando el futuro acaba la tarea (executor.submit(tarea))
     * devuelve un valor. Si el futuro ha terminado su tares (isDone()) la imprimimos por pantalla.
     * Paramos el executor y se detiene el programa.
     */
    private static void callableExample()
    {
        try
        {
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<String> future = executor.submit(WorkingWithCallableExample::operation);
            System.out.println(future.get());
            executor.shutdown();
        }
        catch(InterruptedException | ExecutionException e)
        {
            e.printStackTrace();
        }
    }
    private static String operation()
    {
        Character[] charArray = new Character[]{'H','o','l','a',',',' ','P','a','c','o'};
        StringBuffer bff = new StringBuffer("Recomponiendo cadena ->");
        Arrays.stream(charArray)
                .forEach(character ->{
                    System.out.println(character);
                    bff.append(character);
                    sleep();
                });
        System.out.println(Thread.currentThread()
                .getName());

        return bff.toString();
    }

    private static void sleep()
    {
        try
        {
            Thread.sleep(1000);
            System.out.println("Un segundo después...");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }

}
