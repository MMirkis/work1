package user;

import carRealizebl.Car;

import java.util.List;
import java.util.Objects;

public class User {
    private int balance;
    private List<Car> cars;

    public User(int balace, List<Car> cars) {
        this.balance = balance;
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(cars, user.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cars);
    }

    @Override
    public String toString() {
        return "User{" + "cars=" + cars + '}';
    }

    public List<Car> getCars() {
        return cars;
    }


    public void addCar(Car car) {
        cars.add(car);
    }

    public int getBalance() {
        return balance;
    }


}








