package org.example;

import org.example.Dziedziczenie.Child;
import org.example.Dziedziczenie.Parent;
import org.example.Reukrencja.Recursion;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Recursion recursion = new Recursion();

        System.out.println(recursion.factorialFunction(5));


        Parent parent = new Parent("Jarek", "Wosiński");

        Child child = new Child("Adam", "Wosiński", "CS-GO ");

        parent.showInfo();
        child.showInfo();

    }
}