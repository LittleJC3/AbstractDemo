package abstractStuff;

public class Main {

	public static void main(String[] args) {
		// Declare and instantiate an object of type Device
		//Device myDevice = new Device(); // Cannot instantiate because Device is abstract
		
		Device myDevice; 	// However I CAN declare it. This is a big deal and I'll tell you why later -Bill Nicholson
		
		Motor myMotor;			// Declare
		myMotor = new Motor();	// Instantiate
		myMotor.turnOn();		// Compile-time binding/polymorphism
		
		// Can I apply the substitution principle here??
		myDevice = myMotor;		// Can I say base = derived?
		myDevice.turnOn();		// What does this do? Calls the Motor method!!!!!
		
		Conveyor myConveyor = new Conveyor();
		myDevice = myConveyor; // Assigned myConveyor to Device (substitution)
		myDevice.turnOn();     // Run-time polymorphism. Calls Conveyor.turnOn() !!!!
	}

}
