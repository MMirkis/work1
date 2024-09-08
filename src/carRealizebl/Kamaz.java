package carRealizebl;

import useblEnum.Fuel;

public class Kamaz extends Car {
    public Kamaz(String name) {
        super(name, 150, 3800, 15);
    }



    @Override
    public int getPetrol() {
        return Fuel.PETROL_92.getPrice();
    }
}
