package org.launchcode.studio7;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.





    DVD myDvd = new DVD("DVD");
    CD myCd = new CD("CD");
    FloppyDisks myFloppy = new FloppyDisks("Floppy");
    LPs myLP = new LPs("Record");
    Frisbee myFrisbee = new Frisbee("Frisby");
    Wheel myWheel = new Wheel("Wheel");

        ArrayList<BaseDisc> devices = new ArrayList<>(Arrays.asList(myDvd, myCd, myFloppy, myLP, myFrisbee,
                myWheel));

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myDvd.spinDisc();
        myCd.spinDisc();
        myFloppy.spinDisc();
        myLP.spinDisc();
        myWheel.turn("wheel");
        myFrisbee.turn("frisbee");

        System.out.println("\n*** The Shapes of our devices ***\n");
        for(BaseDisc device : devices) {
            System.out.println("*****");
            System.out.println("The shape of my " +device.type +" is "  + device.shape +".");
            System.out.println("*****\n");

        }

//        System.out.println("*****");
//
//        System.out.println("*****");
//
        System.out.println("The shape of my CD is " + myCd.type +".");
//        System.out.println("The shape of my Floppy Disk is " + myFloppy.shape +".");
//        System.out.println("The shape of my DVD is " +myDvd.shape +".");
//        System.out.println("The shape of my LP is " +myLP.shape +".");


    }
}
