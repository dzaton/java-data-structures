package com.dzaton.DTO;

import java.util.Objects;

public record Ball(String color) {
    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                '}';
    }


}
