package org.launchcode.studio7;

public class Wheel extends BaseDisc {

    public Wheel (String type, String shape) {
        super(type, shape);
    }


    @Override
    public void turn(String object) {
        System.out.println("The " + object + " is moving.");

    }
}
