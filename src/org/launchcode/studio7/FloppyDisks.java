package org.launchcode.studio7;

public class FloppyDisks extends BaseDisc implements  OpticalDisc{

    private double capacity = 1.44;

    public FloppyDisks (String type, String shape) {
        super(type, shape);
    }

    @Override
    public void spinDisc() {
        System.out.println("A floppy disk spins at a rate of 300 rpm");
    }

    @Override
    public double returnCapacity() {
        return this.capacity;
    }


    String shape = "square";

}
