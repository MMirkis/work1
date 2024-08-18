import java.util.HashMap;
import java.util.Map;

public abstract class Car {
    private int size;
    private int mileage;
    private int sizeTank;
    protected Map<Integer, Integer> fuel;

    public Car(int size, int mileage, int sizeTank) {
        this.size = size;
        this.mileage = mileage;
        this.sizeTank = sizeTank;
        fuel=new HashMap<>();
        fuel.put(92,100);
        fuel.put(96,150);
        fuel.put(98,200);
        fuel.put(100,300);
    }

}