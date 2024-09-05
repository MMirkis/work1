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

public class Main {
    public static void main(String[] args) {
        User user=new User(100000000,new ArrayList<>());
        user.addCar(new Jeep("Ленд Крузкр"));
        user.addCar(new Kamaz("Тундра"));
        user.addCar(new SportCar("Бугати"));
        MachineHandler machineHandler=new MachineHandler();
        TO to=new TO();
        Washing washing=new Washing();
        Refill refill=new Refill();
        CalculateService calculateService=new CalculateService(to,washing,refill);
        machineHandler.calculateServiceCost(user,calculateService);
    }
}