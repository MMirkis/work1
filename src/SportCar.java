public class SportCar extends Car {
    public SportCar(String name) {
        super(name, 30, 1000, 5);
    }

    @Override
    public int refill() {
        return getSizeTank() * fuel.get(98);
    }

}
