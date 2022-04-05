package com.dzaton.Funcional.TheAnonimousClasses;

@FunctionalInterface
public interface Operation {
    //Solo puede haber un método abstracto
    float operation();

    private void interfacePrivateMethod(){
        System.out.println("LLamando al método privado de una interfaz");
        System.out.println("Desde private podemos llamar a un método estático");
        interfaceStaticMethod();
    }

    static void interfaceStaticMethod(){
        System.out.println("Llamando al método estático de una interfaz");
    }

    default void interfaceDefaultMethod(){
        System.out.println("Llamando al método default de una interfaz");
        System.out.println("Desde default llamar a métodos privados y estáticos");
        interfaceStaticMethod();
        interfacePrivateMethod();
    }
}
