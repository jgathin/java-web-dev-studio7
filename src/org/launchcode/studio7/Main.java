package org.launchcode.studio7;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.





    DVD myDvd = new DVD("DVD", "round");
    CD myCd = new CD("CD", "round");
    FloppyDisks myFloppy = new FloppyDisks("floppy", "square");
    LPs myLP = new LPs("record", "round");
    Frisbee myFrisbee = new Frisbee("frisby", "round");
    Wheel myWheel = new Wheel("wheel", "round");

        ArrayList<BaseDisc> devices = new ArrayList<>(Arrays.asList(myDvd, myCd, myFloppy, myLP, myFrisbee,
                myWheel));

        // TODO: Call each CD and DVD method to verify that they work as expected.

//        myDvd.spinDisc();
//        myCd.spinDisc();
//        myFloppy.spinDisc();
//        myLP.spinDisc();
//        myWheel.turn(myWheel.type);
//        myFrisbee.turn(myFrisbee.type);

        System.out.println("\n*** The Shapes of My Devices ***\n");
        for(BaseDisc device : devices) {
            System.out.println("*****");

            if(device.type.equals("wheel") || (device.type.equals("frisby"))) {
                device.turn(device.type);
            } else {
                device.spinDisc();
            }
            System.out.println("The shape of my " +device.type +" is "  + device.shape +".");
            System.out.println("*****\n");

        }

//        System.out.println("*****");
//
//        System.out.println("*****");
//
//        System.out.println("The shape of my CD is " + myCd.type +".");
//        System.out.println("The shape of my Floppy Disk is " + myFloppy.shape +".");
//        System.out.println("The shape of my DVD is " +myDvd.shape +".");
//        System.out.println("The shape of my LP is " +myLP.shape +".");


    }
}
