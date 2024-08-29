package eu.vertexware.javadocexamples;

/**
 * The Main class demonstrates the usage of the Vehicle and Car classes.
 *
 * <p>This class creates instances of Vehicle and Car, and performs various operations such as starting, stopping, accelerating, decelerating, and calculating crash probability and fuel efficiency.</p>
 *
 * @since 1.0
 * @version 1.1
 */
public class Main {

    /**
     * The main method is the entry point of the application.
     *
     * <p>It creates a Vehicle object and performs various operations on it. It also creates a Car object and performs operations specific to the Car class.</p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a new vehicle
        Vehicle vehicle = new Vehicle();

        // Start the vehicle
        vehicle.start();

        // Accelerate the vehicle
        vehicle.accelerate(50.0);

        // Calculate crash probability
        int crashProbability = vehicle.crashProbability();
        System.out.println("Crash Probability: " + crashProbability + "%");

        // Calculate fuel efficiency
        double fuelEfficiency = vehicle.calculateFuelEfficiency(100.0, 5.0);
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");

        // Decelerate the vehicle
        vehicle.decelerate(50.0);

        // Stop the vehicle
        vehicle.stop();

        // Create a new car
        Car car = new Car();

        // Honk the car's horn
        car.honk();

        // Crank start the car
        car.crankStart();
    }
}