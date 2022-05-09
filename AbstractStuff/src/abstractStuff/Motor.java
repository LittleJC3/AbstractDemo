package abstractStuff;

public class Motor extends Device {
	private int maxRPM;
	/**
	 * This method replaces the abstract method signature in the super class
	 */
	@Override
	public void turnOn() {
		System.out.println("I am a motor and I am turning on.");

	}

	@Override
	public void turnOff() {
		System.out.println("I am a motor and I am turning OFF.");

	}

	
	
	public int getMaxRPM() {
		return maxRPM;
	}

	public void setMaxRPM(int maxRPM) {
		this.maxRPM = maxRPM;
	}
	
	public String toString() {
		return "Motor Max RPM = " + getMaxRPM();
	}
}
