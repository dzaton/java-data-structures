package com.dzaton.Funcional.TheAnonimousClasses;

public class AnonimousClassMain {

    public AnonimousClassMain(){
        /**
         * Clase anónima.
         * Para mejorar la legibilidad seleccionar desde new Operation hasta el final de la clase anónima y en Refractor dar en Extract Method
         */
        Operation o1 = multiplication();
        printResultOfThis(o1);

        Operation o2 = () -> 3.3f * 10;
        printResultOfThis(o2);

        printResultOfThis(()->10*10);

        printResultOfThis(this::anyMethod);
    }

    private Operation multiplication() {
        return new Operation() {
            @Override
            public float operation() {
                var value1 = 3.3f;
                print("Primer valor: " + value1);
                var value2 = 3;
                print("Segundo valor: " + value2);

                return value1 * value2;
            }

            private void print(String value) {
                System.out.println(value);
            }
        };
    }

    private float anyMethod(){
        return 20.5f / 2;
    }

    private void printResultOfThis(Operation operation){
        System.out.println(operation.operation());
    }

    public static void main(String[] args) {
        new AnonimousClassMain();
    }




}
