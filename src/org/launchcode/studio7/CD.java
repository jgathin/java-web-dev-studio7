package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    private double capacity = 700;

    public CD (String type, String shape) {
        super(type, shape);
    }




    @Override
    public void spinDisc() {

        System.out.println("A CD spins at a rate of 200 - 500 rpm");

    }

    @Override
    public double returnCapacity() {
        return this.capacity;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
