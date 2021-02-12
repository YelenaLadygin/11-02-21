package com.company;

import lombok.Getter;
import lombok.Setter;

public class Lambrador extends Dog {
   private @Getter @Setter
   int intellegenceQuantity;

   public  void bringSlippers (){
       System.out.print(" bring my slippers");
   }
    public Lambrador (String name, int size, String color,int bark,int intellegenceQuantity) {
        super(name,size,color,bark);
        this.intellegenceQuantity=intellegenceQuantity;
    }
    public void gotoVet( ) {
        System.out.println(String.format("Labrador go to vet" ));
    }
}

