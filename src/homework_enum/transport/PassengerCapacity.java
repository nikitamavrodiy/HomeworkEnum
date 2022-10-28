package homework_enum.transport;

public enum PassengerCapacity {
    XS(0, 10),
    S(0, 25),
    M(40, 50),
    L(60, 80),
    XL(100, 120);

    private final int capacityFrom;
    private final int capacityTo;


    PassengerCapacity(int capacityFrom, int capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    @Override
    public String toString() {
        String capacity = capacityFrom > 0
                ? capacityFrom + " - " + capacityTo
                : String.valueOf(capacityTo);
        return "Вместимость: "+ name()+"(" + capacity + " мест)";
    }
}
