package com.ga;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal mouse;

        mouse= new Animal(4,20,true,"Penny");
        System.out.println(mouse.getName());
        System.out.println(mouse.isEndangered());
        System.out.println(mouse.getNumLegs());

        mouse.setName("Chip");
        System.out.println(mouse.getName());

        System.out.println(mouse);


    }

}
