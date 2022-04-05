package com.dzaton.Funcional.TheAnonimousClasses;

/**
 * Para poder llamar a un método default debemos implementar Operacion y su método
 */
public class InterfacesMain implements Operation {

    public InterfacesMain(){
        Operation.interfaceStaticMethod();
        interfaceDefaultMethod();
    }

    public static void main(String[] args) {
        new InterfacesMain();
    }

    @Override
    public float operation() {
        return 0;
    }
}
