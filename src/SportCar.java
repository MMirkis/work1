public class SportCar extends Car {
    public SportCar(int size, int mileage,int sizeTank){
        super(size,mileage,sizeTank);
    }

    @Override
    public int Refill(int sizeTank) {
        return sizeTank*fuel.get(100);
    }

}
