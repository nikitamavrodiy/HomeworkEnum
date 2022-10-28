package oop.part4.transport;

import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing {
    public enum loadCapacityType {
        N1(),
        N2(),
        N3();

        private final float weight;

        loadCapacityType(float weight) {
            this.weight = weight;
        }
    }


    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMovement() {
        System.out.printf("Truck %s %s started moving",
                this.getBrand(), this.getModel());
        System.out.println();
    }

    @Override
    public void stopMovement() {
        System.out.printf("Truck %s %s stopped moving",
                this.getBrand(), this.getModel());
        System.out.println();
    }

    @Override
    public void pitStop() {
        System.out.printf("Truck %s %s performed pit-stop",
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
