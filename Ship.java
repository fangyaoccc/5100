public class Ship extends Vehicle {
    private int displacement; // in tonnes
    private boolean isPassengerShip;

    public Ship(String make, String model, int year, int displacement, boolean isPassengerShip) {
        super(make, model, year);
        this.displacement = displacement;
        this.isPassengerShip = isPassengerShip;
    }

    @Override
    public void displayDetails() {
        System.out.println("Ship: " + make + " " + model + " (" + year + ")");
        System.out.println("Displacement: " + displacement + " tonnes");
        System.out.println("Is Passenger Ship: " + (isPassengerShip ? "Yes" : "No"));
    }
}