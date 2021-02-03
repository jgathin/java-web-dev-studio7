package org.launchcode.studio7;

public class LPs extends BaseDisc implements OpticalDisc {

    private int capacity = 225;

    public LPs (String type, String shape) {
        super(type, shape);
    }

    @Override
    public void spinDisc() {
        System.out.println("A record spins at a rate of 78 rpm");
    }

    @Override
    public double returnCapacity() {
        return this.capacity;
    }


}
