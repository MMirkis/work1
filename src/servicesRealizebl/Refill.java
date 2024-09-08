package servicesRealizebl;

import carRealizebl.Car;
import user.User;

public class Refill implements ServicesRealise {
    @Override
    public boolean isApplicable(CalculateService request) {
        return request.getRefill() != null;
    }

    @Override
    public void apply(Car car, User user) {
        System.out.println("...........");
        int result = car.getSizeTank() * car.getPetrol();
        System.out.println("Cтоимость заправки = " + result + " p");
        int balance = user.getBalance();
        if (balance < result) {
            System.out.println("Недостаточно средств.Пополните баланс");
        } else {
            user.deductBalance(result);
            System.out.println("Услуга оплачена остаток на счете: " + user.getBalance() + " p");
        }
    }
}
