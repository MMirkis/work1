package servicesRealizebl;

import carRealizebl.Car;
import user.User;

public class Washing implements ServicesRealise {
    private final int cof = 10;

    @Override
    public boolean isApplicable(CalculateService request) {
        return request.getWashing() != null;
    }

    @Override
    public void apply(Car car, User user) {
        System.out.println("...........");
        int result = car.getSize() * cof;
        System.out.println("Cтоимость Мойки = " + result);
        int balance = user.getBalance();
        if (balance < result) {
            System.out.println("Недостаточно средств.Пополните баланс");
        } else {
            balance -= result;
            System.out.println("Услуга оплачена остаток на счете: " + balance + " p");
        }
    }
}
