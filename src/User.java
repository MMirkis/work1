import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private int balace;
    private ArrayList<Car> carFleet;

    public User(int balace) {
        carFleet = new ArrayList<>();
        this.balace = balace;
    }

    public void addCar(Car car) {
        carFleet.add(car);
    }

    public void calculeteServiceCost() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На какую услугу хотите сделать расчет?\n ТО\n Мойка\n Заправка \n Для закрытия программы введите : 1 ");
        String serviceType = scanner.nextLine();
        switch (serviceType) {
            case "Мойка":
                calcultWashing();
                break;
            case "ТО":
                calcultTO();
                break;
            case "Заправка":
                calcultFuel();
                break;
            case "1":
                System.exit(0);
            default:
                System.out.println("Не коректный ввод данных, попробуйте сново");
                calculeteServiceCost();
        }
    }

    public void calcultWashing() {
        double washPrice = 0;
        for (Car car : carFleet) {
            washPrice += car.washing();
            System.out.println(car.getName() + " -> " + car.washing() + " р");
        }
        System.out.println("Итог: " + washPrice + " p");
        if (balace < washPrice) {
            System.out.println("Недостаточно средств.Пополните баланс");
            calculeteServiceCost();
        } else {
            balace -= washPrice;
            System.out.println("Услуга оплачена остаток на счете: " + balace + " p");
        }

    }

    public void calcultTO() {
        double priceTO = 0;
        for (Car car : carFleet) {
            priceTO += car.tO();
            System.out.println(car.getName() + "-> " + car.tO() + " p");
        }
        System.out.println("Итог: " + priceTO + " p");
        if (balace < priceTO) {
            System.out.println("Недостаточно средств. Пополните баланс");
            calculeteServiceCost();
        } else {
            balace -= priceTO;
            System.out.println("Услуга оплачена остаток на счете: " + balace + " p");
        }

    }

    public void calcultFuel() {
        double fuelPrice = 0;
        for (Car car : carFleet) {
            fuelPrice += car.refill();
            System.out.println(car.getName() + "-> " + car.refill() + " p");
        }
        System.out.println("Итог: " + fuelPrice + " p");
        if (balace < fuelPrice) {
            System.out.println("Недостаточно средств.Пополните баланс");
            calculeteServiceCost();
        } else {
            balace -= fuelPrice;
            System.out.println("Услуга оплачена остаток на счете : " + balace + " p");
        }

    }

}
