package Lab2.MethodOverRiding;

public class SportCar extends Car {
	private int noOfDoor;

	public int getNoOfDoor() {
		return noOfDoor;
	}

	public SportCar(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, make, noOfDoor);
		//setNoOfDoors(2);
	}

	
public void display()
{
	super.display();
}
	@Override
	public String toString() {
		return "SportCar [noOfDoor=" + noOfDoor + "]";
	}

	
	

}
