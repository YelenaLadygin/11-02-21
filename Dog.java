package com.company;

import lombok.Getter;
import lombok.Setter;

public class Dog extends Animal {
    private @Getter @Setter int barkLength;

    public void guardHouse(){
        System.out.print(" Dog guard the house!");
    }

    public Dog (String name, int size, String color,int bark) {
        super(name,size,color);
        this.barkLength=bark;
    }

    public void gotoVet( ) {
        System.out.println(String.format("Dog go to vet" ));
    }
}
