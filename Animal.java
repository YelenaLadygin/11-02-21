package com.company;

import lombok.Getter;
import lombok.Setter;

public class Animal {
    private @Getter
    @Setter
    String name;
    private @Getter
    @Setter
    int size;
    private @Getter
    @Setter
    String color;

    public void gotoVet( ) {
        System.out.println(String.format(" Animal go to vet " ));
    }

    public Animal(String name, int size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }
}