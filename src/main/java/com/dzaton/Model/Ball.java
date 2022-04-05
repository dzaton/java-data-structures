package com.dzaton.Model;

import java.util.Objects;

public class Ball {
    private String color;

    public Ball(String color){
        this.color = color;
    }

    /**
     * Añadimos equals() y hasCode() para que los objetos iguales se traten como el mismo en las clase de WorkingWithSets
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Objects.equals(color, ball.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                '}';
    }
}
