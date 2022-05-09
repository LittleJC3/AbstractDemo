package abstractStuff;

public class Conveyor extends Device {
	private int rollerDiameter;

	@Override
	public void turnOn() {
		System.out.println("I am a motor and I am turning on now.");

	}

	@Override
	public void turnOff() {
		System.out.println("I am a motor and I am turning OFF.");

	}

	public int getRollerDiameter() {
		return rollerDiameter;
	}

	public void setRollerDiameter(int rollerDiameter) {
		this.rollerDiameter = rollerDiameter;
	}
	
	public String toString() {
		return "Conveyor Roller Diamter = " + getRollerDiameter();
	}
}
