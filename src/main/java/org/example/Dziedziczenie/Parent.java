package org.example.Dziedziczenie;

public class Parent {

    protected String firstName;
    protected String lastName;

    public Parent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public  void showInfo(){
        System.out.println(" Hi i am  " + this.getFirstName() + " " + this.getLastName() + " " + " parent");

    }
}
