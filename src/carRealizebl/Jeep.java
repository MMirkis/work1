package carRealizebl;


import useblEnum.Fuel;

public class Jeep extends Car {
    public Jeep(String name) {
        super(name, 80, 2600, 10);
    }


    @Override
    public int getPetrol() {
        return Fuel.PETROL_92.getPrice();
    }
}
