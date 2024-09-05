package servicesRealizebl;

import carRealizebl.Car;
import user.User;

public class TO implements ServicesRealise {
    private final int coof = 13;

    @Override
    public boolean isApplicable(CalculateService request) {
        return request.getTo() != null;
    }

    @Override
    public void apply(Car car, User user) {
        System.out.println(".........");
        int result = car.getMileage() * coof;
        System.out.println("Cтоимость ТО = " + result);
        int balance = user.getBalance();
        if (balance < result) {
            System.out.println("Недостаточно средств.Пополните баланс");
        } else {
            balance -= result;
            System.out.println("Услуга оплачена остаток на счете: " + balance + " p");
        }

    }
}
