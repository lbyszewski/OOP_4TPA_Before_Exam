package org.example.Reukrencja;

public class Recursion {

    public double factorialFunction(double someInputValue){
        if(someInputValue == 0){
            return  1;
        }else {
            return  someInputValue * factorialFunction(someInputValue - 1);
        }
    }
}
