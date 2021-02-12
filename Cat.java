package com.company;

import lombok.Getter;
import lombok.Setter;

public class Cat extends Animal{

   private @Getter @Setter String favoriteMilkName;

   public  void caddle (){
       System.out.print(" it is a bad cat");
   }
    public Cat (String name, int size, String color,String milk) {
        super(name,size,color);
        this.favoriteMilkName=milk;
    }
}
