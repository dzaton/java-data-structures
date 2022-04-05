package com.dzaton.DTO;

import java.util.Objects;

public record Person(String name, int age) {
    @Override
    public String toString() {
        return "Persona " +
                "de nombre " + name +
                " y edad " + age ;
    }
}
