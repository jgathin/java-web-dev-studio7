package org.launchcode.studio7;

public class FloppyDisks extends BaseDisc implements  OpticalDisc{

    public FloppyDisks (String type) {
        super(type);
    }
    @Override
    public void spinDisc() {
        System.out.println("A floppy disk spins at a rate of 300 rpm");
    }


    String shape = "square";

}
