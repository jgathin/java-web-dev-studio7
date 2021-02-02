package org.launchcode.studio7;

public abstract class BaseDisc  {


    String type;

public BaseDisc (String type) {
    this.type = type;
}

String shape = "round";



public void turn(String object) {
    System.out.println("The " + object + " is moving.");
}

public String objtype(String type) {
    return this.type;
}





}
