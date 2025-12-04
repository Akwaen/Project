

public class Main {
    public static void main(String[] args) {
        // Create a default Truck object
        Truck defaultTruck = new Truck();
        System.out.println("Default Truck: " + defaultTruck);

        // Create a custom Engine object
        Engine customEngine = new Engine("V8");

        // Create a custom Truck object with the custom Engine
        Truck customTruck = new Truck("Ford", "Blue", 4, 10000, customEngine);
        System.out.println("Custom Truck: " + customTruck);

        // Test behavior methods on the default Truck
        System.out.println("\nTesting Default Truck:");
        defaultTruck.setBrand("Chevrolet");
        defaultTruck.setColor("Red");
        defaultTruck.setNumberOfSeats(2);
        defaultTruck.setTowingCapacity(7500);
        defaultTruck.getEngine().setType("Electric");
        System.out.println("Updated Default Truck: " + defaultTruck);

        // Test behavior methods on the custom Truck
        System.out.println("\nTesting Custom Truck:");
        customTruck.setColor("Black");
        customTruck.getEngine().setType("Diesel");
        System.out.println("Updated Custom Truck: " + customTruck);
    }
}