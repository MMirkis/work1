package useblEnum;

public enum Fuel {
    PETROL_92(50),
    PETROL_95(70),
    PETROL_98(90);

    private final int price;

    Fuel(int price) {
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}
