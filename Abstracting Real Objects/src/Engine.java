
/**
 * Represents an Engine with a type.
 */
public class Engine {
    private String type;

    /**
     * Default constructor that initializes the engine type to "Unknown".
     */
    public Engine() {
        this.type = "Unknown";
    }

    /**
     * Constructs an Engine with the specified type.
     * 
     * @param type the type of the engine
     * @throws IllegalArgumentException if the type is null or empty
     */
    public Engine(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Engine type cannot be null or empty.");
        }
        this.type = type;
    }

    /**
     * Returns the type of the engine.
     * 
     * @return the engine type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the engine.
     * 
     * @param type the new engine type
     * @throws IllegalArgumentException if the type is null or empty
     */
    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Engine type cannot be null or empty.");
        }
        this.type = type;
    }

    /**
     * Returns a string representation of the Engine.
     * 
     * @return a string describing the engine
     */
    @Override
    public String toString() {
        return "Engine [type=" + type + "]";
    }
}