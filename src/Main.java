public class Main {
    public static void main(String[] args) {
        User user = new User(10000);
        user.addCar(new Jeep("Ленд Крузкр"));
        user.addCar(new Kamaz("Тундра"));
        user.addCar(new SportCar("Бугати"));
        user.calculeteServiceCost();
    }
}