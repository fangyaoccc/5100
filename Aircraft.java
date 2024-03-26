public class Aircraft extends Vehicle {
    private int maxAltitude; // in feet
    private int seatingCapacity;

    public Aircraft(String make, String model, int year, int maxAltitude, int seatingCapacity) {
        super(make, model, year);
        this.maxAltitude = maxAltitude;
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Aircraft: " + make + " " + model + " (" + year + ")");
        System.out.println("Maximum Altitude: " + maxAltitude + " feet");
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}