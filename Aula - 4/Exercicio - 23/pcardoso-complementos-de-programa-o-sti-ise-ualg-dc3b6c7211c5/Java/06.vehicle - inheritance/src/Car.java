
// TODO: Auto-generated Javadoc
/**
 * The Class Car.
 */
public class Car extends LandVehicle {

	/** The total filled fuel */
	private double filledFuel;

	/** The total car kms. */
	private double kms;

	/** The engine. */
	private Engine engine;

	/** The number of doors. */
	private int    numberOfDoors;

	/**
	 * Instantiates a new car.
	 *
	 * @param owner the owner
	 * @param brand the brand
	 * @param model the model
	 * @param numberOfPassengers the number of passengers
	 * @param landVelocity the land velocity
	 * @param wheels the wheels
	 * @param numberOfWheels the number of wheels
	 * @param engine the engine
	 * @param numberOfDoors the number of doors
	 */
	public Car(Person owner, String brand, String model, int numberOfPassengers, float landVelocity, Wheel wheels,
			int numberOfWheels, Engine engine, int numberOfDoors) {
		super(owner, brand, model, numberOfPassengers, landVelocity, wheels, numberOfWheels);
		this.engine = engine;
		this.numberOfDoors = numberOfDoors;
	}

	/**
	 * the average consumption (l/100km) of the vehicle in its life.
	 *
	 * @return the double
	 */
	public double consumption(){
		return this.filledFuel / this.kms * 100;
	}

	/**
	 * Estimated consumption when doing kms kilometers.
	 *
	 * @param kms the kms
	 * @return the double
	 */
	public double consumption(double kms){
		return this.filledFuel / this.kms *  kms ;
	}
	
	/**
	 * Expected consumption when doing kms kilometers applied a given load factor.
	 *
	 * @param kms the kms
	 * @param loadFactor the load factor
	 * @return the double
	 */
	public double consumption(double kms, double loadFactor){
		return this.filledFuel / this.kms *  kms  * loadFactor;
	}


	/**
	 * Gets the car consumption.
	 *
	 * @return the car consumption
	 */
	public double getFilledFuel() {
		return filledFuel;
	}

	/**
	 * Gets the car kms.
	 *
	 * @return the car kms
	 */
	public double getKms() {
		return kms;
	}                 
	/**
	 * Gets the engine.
	 *
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}

	/**
	 * Gets the number of doors.
	 *
	 * @return the number of doors
	 */
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	/**
	 * My method.
	 */
	public void myMethod() {
		System.out.println("The engine has " + this.engine.getHorsepower() + " of horsepower  as a landvelocity of "
				+ this.getLandVelocity());
	}

	/**
	 * Sets the car consumption.
	 *
	 * @param carConsumption the new car consumption
	 */
	public void setFilledFuel(double carConsumption) {
		this.filledFuel = carConsumption;
	}

	/**
	 * Sets the car kms.
	 *
	 * @param carKms the new car kms
	 */
	public void setKms(double carKms) {
		this.kms = carKms;
	}

	/**
	 * Sets the engine.
	 *
	 * @param engine the new engine
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	/**
	 * Sets the number of doors.
	 *
	 * @param numberOfDoors the new number of doors
	 */
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}


	/* (non-Javadoc)
	 * @see LandVehicle#vehicleInfo()
	 */
	@Override
	public String vehicleInfo(){
		return "This vehicle is a " + this.getBrand() + " " + this.getModel() 
		+ " has "+ this.getNumberOfWheels() + " wheels, an engine with "
		+ this.getEngine().getNumberCylinders() + " cylinders and is owned by " + this.getOwner().getName();
	}


}
