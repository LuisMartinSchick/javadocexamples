package eu.vertexware.javadocexamples;

/**
 * The Car class represents a car, which is a type of vehicle.
 *
 * <p>This class extends the {@link eu.vertexware.javadocexamples.Vehicle} class and adds additional functionality specific to cars, such as honking the horn ({@link #honk()}) and crank-starting the engine ({@link #crankStart()}).</p>
 *
 * @since 1.0
 * @version 1.1
 * @author Luis
 * @see eu.vertexware.javadocexamples.Vehicle
 */
public class Car extends Vehicle {

    /**
     * Honk the car's horn.
     * <p>
     * This is a simple method that prints "Honk honk!" to the console.
     * @since 1.0
     * @author Luis
     */
    public void honk() {
        System.out.println("Honk honk!");
    }

    /**
     * Start the car manually, by cranking the starter.
     * Used for cars that have crankstarts. (Older than 1950)
     * </hr><p>
     * <em>Steps to crank-start a car: </em>
     * <ol>
     *     <li>Hand-Crank the starter</li>
     *     <li>Adjust Timings</li>
     *     <li>Set the Points</li>
     *     <li>Adjust the Choke</li>
     *     <li>Watch out for Vapor Lock</li>
     *     <li>Use Fuel Additives</li>
     *     <li><b>Drive Away!</b></li>
     * </ol>
     * @deprecated Use {@link #start()} instead. No cars use crankstarts anymore.
     * @since 0.1
     * @see <a href="https://www.caranddriver.com/features/g15376936/how-cars-started/">Car and Driver - How Cars Started Back in the Early Days</a>
     * @since 1.0
     * @author Luis
     */
    public void crankStart() {
        System.out.println("Cranking the starter...");
        start();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void start() {
        System.out.println("Car started");
    }
}
