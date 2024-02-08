package org.example.Hermetyzacja;

public class EncapsMethod {
    private String otherProperty;
    private String secondProperty;

    public EncapsMethod(String otherProperty, String secondProperty) {
        this.otherProperty = otherProperty;
        this.secondProperty = secondProperty;
    }

    public String getOtherProperty() {
        return otherProperty;
    }

    public void setOtherProperty(String otherProperty) {
        this.otherProperty = otherProperty;
    }

    public String getSecondProperty() {
        return secondProperty;
    }

    public void setSecondProperty(String secondProperty) {
        this.secondProperty = secondProperty;
    }

    public void showResultOfSomthing(String inputOne, String inputTwo){
      hiddenMyLogic(inputOne,inputTwo);
    }

    private void hiddenMyLogic(String someOne, String someOther ){
        this.setOtherProperty(someOne);
        this.setSecondProperty(someOther);

        System.out.println(" My info about this: " +  " " + this.getOtherProperty() + " " + this.getSecondProperty());


    }
}
