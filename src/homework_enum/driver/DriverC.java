package homework_enum.driver;

import homework_enum.transport.Truck;

public class DriverC extends Driver<Truck> {
    public DriverC(String fullName, int driveExperience, Truck car) {
        super(fullName, "C", driveExperience, car);
    }
}
