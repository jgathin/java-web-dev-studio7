package org.launchcode.studio7;

public class FloppyDisks extends BaseDisc implements  OpticalDisc{

    public FloppyDisks (String type, String shape) {
        super(type, shape);
    }

    @Override
    public void spinDisc() {
        System.out.println("A floppy disk spins at a rate of 300 rpm");
    }


    String shape = "square";

}
