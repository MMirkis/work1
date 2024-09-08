import carRealizebl.Car;
import carRealizebl.Jeep;
import carRealizebl.Kamaz;
import carRealizebl.SportCar;
import handler.MachineHandler;
import servicesRealizebl.CalculateService;
import servicesRealizebl.Refill;
import servicesRealizebl.TO;
import servicesRealizebl.Washing;
import user.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Jeep jeep= new Jeep("Гелик");
       Kamaz kamaz=new Kamaz("Трак");
       SportCar sportCar=new SportCar("Бугатти");
        List<Car> cars=new ArrayList<>();
        cars.add(jeep);
        cars.add(kamaz);
        cars.add(sportCar);
        User user =new User(100000,cars);
        TO to= new TO();
        Washing washing=new Washing();
        Refill refill=new Refill();
        CalculateService request=new CalculateService(to,washing,refill);
        MachineHandler machineHandler=new MachineHandler(List.of(to,washing,refill));
        machineHandler.calculateServiceCost(user,request);

    }
}