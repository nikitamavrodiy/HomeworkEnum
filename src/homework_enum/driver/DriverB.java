package homework_enum.driver;

import homework_enum.transport.Car;

public class DriverB extends Driver<Car> {

    public DriverB(String fullName, int driveExperience, Car car) {
        super(fullName, "B", driveExperience, car);
    }
}
