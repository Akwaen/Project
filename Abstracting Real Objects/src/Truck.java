

/**
 * Represents a Truck with various attributes and behaviors.
 */
public class Truck {
    private String brand;
    private String color;
    private int numberOfSeats;
    private int towingCapacity;
    private Engine engine; // Engine object as an attribute

    /**
     * Default constructor that initializes the truck with default values.
     */
    public Truck() {
        this.brand = "Unknown";
        this.color = "Unknown";
        this.numberOfSeats = 2;
        this.towingCapacity = 5000;
        this.engine = new Engine(); // Default engine
    }

    /**
     * Constructs a Truck with the specified attributes.
     * 
     * @param brand          the brand of the truck
     * @param color          the color of the truck
     * @param numberOfSeats  the number of seats in the truck
     * @param towingCapacity the towing capacity of the truck
     * @param engine         the engine of the truck
     */
    public Truck(String brand, String color, int numberOfSeats, int towingCapacity, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.towingCapacity = towingCapacity;
        this.engine = engine;
    }

    /**
     * Returns the brand of the truck.
     * 
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the brand of the truck.
     * 
     * @param brand the new brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Returns the color of the truck.
     * 
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the truck.
     * 
     * @param color the new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns the number of seats in the truck.
     * 
     * @return the number of seats
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * Sets the number of seats in the truck.
     * 
     * @param numberOfSeats the new number of seats
     */
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * Returns the towing capacity of the truck.
     * 
     * @return the towing capacity
     */
    public int getTowingCapacity() {
        return towingCapacity;
    }

    /**
     * Sets the towing capacity of the truck.
     * 
     * @param towingCapacity the new towing capacity
     */
    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    /**
     * Returns the engine of the truck.
     * 
     * @return the engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Sets the engine of the truck.
     * 
     * @param engine the new engine
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * Returns a string representation of the Truck.
     * 
     * @return a string describing the truck
     */
    @Override
    public String toString() {
        return "Truck [brand=" + brand + ", color=" + color + ", numberOfSeats=" + numberOfSeats + ", towingCapacity="
                + towingCapacity + ", engine=" + engine + "]";
    }
}