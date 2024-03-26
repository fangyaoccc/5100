public class index {
    public static void main(String[] args) {
        Car car = new Car("BMW", "M4", 2024, 5, 15.1);
        Motorbike motorbike = new Motorbike("Yamaha", "R3", 2014, false);
        Aircraft aircraft = new Aircraft("Boeing", "787", 2016, 35000, 416);
        Ship ship = new Ship("Titanic", "Symphony of the Seas", 1912, 26266, true);

        car.displayDetails();
        System.out.println();
        motorbike.displayDetails();
        System.out.println();
        aircraft.displayDetails();
        System.out.println();
        ship.displayDetails();
    }
}