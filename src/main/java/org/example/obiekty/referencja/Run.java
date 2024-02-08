package org.example.obiekty.referencja;

import org.example.Hermetyzacja.EncapsMethod;
import org.example.konstruktory.pola.FieldsAndConstructors;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        FieldsAndConstructors fieldsAndConstructors = new FieldsAndConstructors("Value 1", "Value 2");
        fieldsAndConstructors.someValueOne = "Something new 1";
        fieldsAndConstructors.someValueTwo = "Something new 2";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Value One");
        String newValueOne = scanner.next();

        System.out.println("Value Two");
        String newValueTwo = scanner.next();

        EncapsMethod encapsMethod = new EncapsMethod(newValueOne,newValueTwo);

        encapsMethod.showResultOfSomthing(newValueOne,newValueTwo);


    }
}
