package org.launchcode.studio7;

public abstract class BaseDisc  {


    String type;
    String shape;

public BaseDisc (String type, String shape) {
    this.type = type;
    this.shape = shape;
}



    public void spinDisc(){

    }

public void turn(String object) {
    System.out.println("The " + object + " is moving.");
}

//public String objtype(String type) {
//    return this.type;
}






