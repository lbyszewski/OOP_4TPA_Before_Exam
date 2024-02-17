package org.example.Dziedziczenie;

public class Child extends Parent{


    private String playGame;

    public Child(String firstName, String lastName, String playGame) {
        super(firstName, lastName);
        this.playGame = playGame;
    }

    public  void showInfo(){
        System.out.println(" Hi i am  " + this.getFirstName() + " " + this.getLastName() + " " + " child");

    }
}
