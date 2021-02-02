package org.launchcode.studio7;

public class Frisbee extends BaseDisc{
    public Frisbee (String type, String shape) {
        super(type, shape);
    }


    @Override
    public void turn(String object) {
        System.out.println("The " + object + " is moving.");
    }
}
