package homework_enum;

import homework_enum.driver.DriverB;
import homework_enum.transport.Car;
import homework_enum.transport.Transport;
import homework_enum.transport.Truck;


public class HomeworkEnum {
    public static void main(String[] args) {
        Car car = new Car("bmw","x5", 1.5f);
        DriverB driverB = new DriverB("Test", 5, car);
        System.out.println(driverB);
    }
}
