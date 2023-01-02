package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calculator1 = new Calculator("Casio");
        System.out.println(calculator1.sum(1,2));
        System.out.println(calculator1.sum(1.5f,7.0f));

        Calculator calculator2 = new Calculator("Casio", "fx-CG20");
        System.out.println("calculator1" + calculator1);
        System.out.println("calculator2" + calculator2);
    }
}
