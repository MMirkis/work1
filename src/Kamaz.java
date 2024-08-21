public class Kamaz extends Car {
    public Kamaz(String name) {
        super(name, 150, 3800, 15);
    }

    @Override
    public int refill() {
        return getSizeTank() * fuel.get(95);
    }
}
