public class Jeep extends Car {
    public Jeep(String name) {
        super(name, 80, 2600, 10);
    }

    @Override
    public int refill() {
        return getSizeTank() * fuel.get(92);
    }
}
