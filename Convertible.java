package Lab2.MethodOverRiding;

public class Convertible extends Car{
	private boolean isHoodOpen;

	public Convertible(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor, boolean isHoodOpen) {
		super(noOfWheel, noOfPassenger, model, make, noOfDoor);
		this.isHoodOpen = isHoodOpen;
	}

	public boolean isHoodOpen() {
		return isHoodOpen;
	}

	public void setHoodOpen(boolean isHoodOpen) {
		this.isHoodOpen = isHoodOpen;
	}
	public void display()
	{
		super.display();
		System.out.println("is hood open or close="+isHoodOpen);
	}

	@Override
	public String toString() {
		return super.toString()+"Convertible [isHoodOpen=" + isHoodOpen + "]";
	}

}
