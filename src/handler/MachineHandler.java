package handler;

import servicesRealizebl.CalculateService;
import servicesRealizebl.ServicesRealise;
import user.User;

import java.util.List;

public class MachineHandler {
    List<ServicesRealise> services;

    public void calculateServiceCost(User user, CalculateService request){
        for (ServicesRealise services: services){
            if (services.isApplicable(request)){
                user.getCars().forEach(car->services.apply(car,user));
            }
        }
    }
}
