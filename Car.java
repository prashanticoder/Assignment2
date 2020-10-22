package Lab2.MethodOverRiding;

public class Car extends Vehicle {
	private int noOfDoor;

	
	public Car(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, make);
		this.noOfDoor = noOfDoor;
	}


	public int getNoOfDoor() {
		return noOfDoor;
	}


	public void setNoOfDoor(int noOfDoor) {
		//this.noOfDoor = noOfDoor;
		noOfDoor=2;
	}


	public void display()
	{
		super.display();
		System.out.println("no of doors="+noOfDoor);
	}


	@Override
	public String toString() {
		return super.toString()+"Car [noOfDoor=" + noOfDoor + "]";
	}

	

}
