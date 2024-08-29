package eu.vertexware.javadocexamples;

import lombok.Getter;
import lombok.Setter;

/**
 * Base class for all vehicles.
 *
 * <p>This class provides basic functionalities for starting, stopping, accelerating, and decelerating a vehicle.
 * It also includes methods for calculating crash probability and fuel efficiency.</p>
 *
 * @since 1.0
 * @version 1.1
 */
@Getter
public class Vehicle {

    private boolean started;

    @Setter
    private Double speed = 0.0;

    /**
     * Starts the vehicle.
     *
     * <p>Sets the started flag to true and prints a message indicating that the vehicle has started.</p>
     * @author Luis
     * @since 1.0
     */
    public void start() {
        started = true;
        System.out.println("Vehicle started");
    }

    /**
     * Stops the vehicle.
     *
     * <p>If the vehicle is moving (speed > 0), an IllegalStateException is thrown. Otherwise, sets the started flag to false and prints a message indicating that the vehicle has stopped.</p>
     *
     * @throws IllegalStateException if the vehicle is moving
     * @since 1.0
     * @author Luis
     */
    public void stop() {
        if (speed > 0) {
            throw new IllegalStateException("Cannot stop the vehicle while it is moving.");
        }
        started = false;
        System.out.println("Vehicle stopped");
    }

    /**
     * Accelerates the vehicle by a specified amount.
     *
     * <p>If the vehicle is not started, an IllegalStateException is thrown. Otherwise, increases the speed by the specified amount and prints the new speed.</p>
     *
     * @param amount the amount to increase the speed by
     * @throws IllegalStateException if the vehicle is not started
     * @since 1.0
     * @author Luis
     */
    public void accelerate(Double amount) {
        if (!started) {
            throw new IllegalStateException("Cannot accelerate a vehicle that is not started.");
        }
        speed += amount;
        System.out.println("Vehicle accelerated to " + speed + " km/h");
    }

    /**
     * Decelerates the vehicle by a specified amount.
     *
     * <p>If the vehicle is not started, an IllegalStateException is thrown. Otherwise, decreases the speed by the specified amount and prints the new speed.</p>
     *
     * @param amount the amount to decrease the speed by
     * @throws IllegalStateException if the vehicle is not started
     * @since 1.0
     * @author Luis
     */
    public void decelerate(Double amount) {
        if (!started) {
            throw new IllegalStateException("Cannot decelerate a vehicle that is not started.");
        }
        speed -= amount;
        System.out.println("Vehicle decelerated to " + speed + " km/h");
    }

    /**
     * Calculates the probability of crashing based on the current speed of the vehicle.
     *
     * <p>The base probability is a random value between 0 and 50. An additional probability is added based on the speed of the vehicle. The total probability is the sum of the base probability and the speed factor, capped at 100%.</p>
     *
     * @return the crash probability as a percentage
     * @see #speed
     * @since 1.0
     * @author Luis
     */
    public int crashProbability() {
        // Base probability is a random value between 0 and 50
        int baseProbability = (int) (Math.random() * 50);

        // Additional probability based on speed
        int speedFactor = (int) (speed / 2);

        // Total probability is the sum of base probability and speed factor
        int totalProbability = baseProbability + speedFactor;

        // Ensure the probability does not exceed 100%
        return Math.min(totalProbability, 100);
    }

    /**
     * Calculates the fuel efficiency of the vehicle based on distance traveled and fuel consumed.
     * The formula for fuel efficiency is <code>distance / fuelConsumed</code>.
     *
     * @param distance the distance traveled in kilometers
     * @param fuelConsumed the amount of fuel consumed in liters
     * @return the fuel efficiency in kilometers per liter
     * @throws IllegalArgumentException if distance or fuelConsumed is less than or equal to zero
     * @see #start()
     * @see #stop()
     * @since 1.0
     * @version 1.1
     * @author Luis
     */
    public double calculateFuelEfficiency(double distance, double fuelConsumed) {
        if (distance <= 0 || fuelConsumed <= 0) {
            throw new IllegalArgumentException("Distance and fuel consumed must be greater than zero.");
        }
        return distance / fuelConsumed;
    }
}