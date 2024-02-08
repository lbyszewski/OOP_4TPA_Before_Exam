package org.example.Hermetyzacja;

public class Encapsulation {
    private  String firstValue;
    private  String secondValue;

    public Encapsulation(String firstValue, String secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public String getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(String firstValue) {
        this.firstValue = firstValue;
    }

    public String getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(String secondValue) {
        this.secondValue = secondValue;
    }
}
