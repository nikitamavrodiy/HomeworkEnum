package homework_enum.transport;

import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {
    private final BodyType bodyType;
    public Car(String brand, String model, float engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    public void startMovement() {
        System.out.printf("Car %s %s started moving",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void stopMovement() {
        System.out.printf("Car %s %s stopped moving",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void printType() {
        if (this.bodyType != null) {
            System.out.println(bodyType);
        } else {
            System.out.println("Информации недостаточно");
        }
    }

    @Override
    public void pitStop() {
        System.out.printf("Car %s %s performed pit-stop",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 400);
    }
}
