import java.util.HashMap;
import java.util.Map;

public abstract class Car {
    private String name;
    private int size;
    private int mileage;
    private int sizeTank;
    protected Map<Integer, Integer> fuel;

    public Car(String name, int size, int mileage, int sizeTank) {
        this.name = name;
        this.size = size;
        this.mileage = mileage;
        this.sizeTank = sizeTank;
        fuel = new HashMap<>();
        fuel.put(92, 92);
        fuel.put(95, 95);
        fuel.put(98, 100);
    }

    public int washing() {
        return size * 10;

    }

    public int tO() {
        return mileage * 5;
    }

    public abstract int refill();

    public String getName() {
        return name;
    }

    public int getSizeTank() {
        return sizeTank;
    }
}