package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    public CD (String type, String shape) {
        super(type, shape);
    }


    @Override
    public void spinDisc() {

        System.out.println("A CD spins at a rate of 200 - 500 rpm");

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
