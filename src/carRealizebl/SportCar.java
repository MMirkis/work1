package carRealizebl;

import useblEnum.Fuel;

public class SportCar extends Car {
    public SportCar(String name) {
        super(name, 30, 1000, 5);
    }


    @Override
    public int getPetrol() {
        return Fuel.PETROL_98.getPrice();
    }

}
