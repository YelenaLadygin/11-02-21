package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal animally = new Animal("animal1", 45, "black");
        Dog doggy = new Dog("jack",33,"white",5);
        Lambrador lambradorchik = new Lambrador("hez",70,"brown",9,15);
        Cat catty = new Cat("sonia",25,"red","milky");
        SiamiCat siamiCattty = new SiamiCat("vasya",29,"grey","tnuva","golg");

        Animal[] animals = new Animal[5];
        animals[0] = animally;
        animals[1] = doggy;
        animals[2] = catty;
        animals[3] = lambradorchik;
        animals[4] = siamiCattty;

        for (int i = 0; i < animals.length; i++) {
            animals[i].gotoVet();
        }
        enimalSize (animally);
        enimalSize (doggy);
        enimalSize (catty);
        enimalSize (lambradorchik);
        enimalSize (siamiCattty);
        toGuardtheHouse(lambradorchik);
    }

    static void enimalSize(Animal test) {
        System.out.println(String.format(" the size is %d", test.getSize()));
    }
    static void toGuardtheHouse ( Dog guard){
       guard.guardHouse();
    }
}