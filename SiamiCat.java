package com.company;

import lombok.Getter;
import lombok.Setter;

public class SiamiCat extends Cat {
    private @Getter @Setter String specialColor;

    public SiamiCat (String name, int size, String color,String milk,String color2) {
        super(name,size,color,milk);
        this.specialColor= color2;
    }

}
