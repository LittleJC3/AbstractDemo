package abstractStuff;
/**
 * Model a 'device' i the Distribution Center
 * An abstract class cannot be instantiated
 * All the properties and methods common ALL devices should be here
 * @author admir
 *
 */
public abstract class Device {
	private String modelNumber;
	private String manufacturer;
	
	// This is abstract. I will give it a definition in a derived class.
	public abstract void turnOn(); // Turn on the device. We'll figure out how later.
	public abstract void turnOff();
	
	public String toString() {
		return "Model Number = " + modelNumber + ", " + "Manufacturer = " + manufacturer;
	}
}
