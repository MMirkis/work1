package servicesRealizebl;

import carRealizebl.Car;
import user.User;

public interface ServicesRealise {
    boolean isApplicable(CalculateService request);

    void apply(Car car, User user);
}
