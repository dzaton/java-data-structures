package com.dzaton.Funcional.SomeJavaInterfaces;

public class WorkingWithRunnable {

    public static void main(String[] args)
    {
        runnableExample();
    }

    public static void runnableExample()
    {
        var hilo = new Thread(WorkingWithRunnable::runBehavior);
        hilo.start();

    }

    public static void runBehavior()
    {
        int i= 0;
        while(i++ != 100)
        {
            System.out.println("Llamada a run() n1: "+i);
        }
    }
}
