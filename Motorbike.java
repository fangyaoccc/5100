public class Motorbike extends Vehicle {
    private boolean hasSidecar;

    public Motorbike(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayDetails() {
        System.out.println("Motorbike: " + make + " " + model + " (" + year + ")");
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}