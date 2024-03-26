public class Car extends Vehicle {
    private int seatingCapacity;
    private double trunkSpace; // in cubic feet

    public Car(String make, String model, int year, int seatingCapacity, double trunkSpace) {
        super(make, model, year);
        this.seatingCapacity = seatingCapacity;
        this.trunkSpace = trunkSpace;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car: " + make + " " + model + " (" + year + ")");
        System.out.println("Seating: " + seatingCapacity);
        System.out.println("Trunk Space: " + trunkSpace + " cubic feet");
    }
}