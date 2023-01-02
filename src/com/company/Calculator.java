package com.company;

public class Calculator {
    private String companyName;
    private String model;


    Calculator(String companyName){
        this.companyName=companyName;
        this.model=null;
    }

    Calculator(String companyName,String model){
        this.companyName = companyName;
        this.model=model;
    }

    public int sum(int a , int b){
        return a+b;
    }

    public float sum(float a , float b){
        return a+b;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "companyName='" + companyName + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
