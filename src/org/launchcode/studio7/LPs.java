package org.launchcode.studio7;

public class LPs extends BaseDisc implements OpticalDisc {
    public LPs (String type) {
        super(type);
    }

    @Override
    public void spinDisc() {
        System.out.println("A record spins at a rate of 78 rpm");
    }


}
