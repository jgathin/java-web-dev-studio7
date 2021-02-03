package org.launchcode.studio7;

public abstract class BaseDisc  {


    String type;
    String shape;
    double capacity;

public BaseDisc (String type, String shape) {
    this.type = type;
    this.shape = shape;
    //this.capacity
}



    public void spinDisc(){

    }

    public double returnCapacity() {
    return this.capacity;
    }

public void turn(String object) {
    System.out.println("The " + object + " is moving.");
}

//public String objtype(String type) {
//    return this.type;
}






