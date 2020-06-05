package com.example.scientificcalculator;

public class DemoTwo {

    public String evenOrOdd(int a){
        String status ="";
        if(a%2 ==0){
            status= "Even number";
        }else {
            status= "Odd number";
        }
        return status;
    }
}
