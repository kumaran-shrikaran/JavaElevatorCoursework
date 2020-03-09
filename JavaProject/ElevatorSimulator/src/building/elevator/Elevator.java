package building.elevator;

import building.Floor;

public class Elevator {
	private Floor currentFloor;
	private Floor chosenFloor;
	private Floor maxFloor;
	private Direction direction;
	private int maxPeople;
	
	public Elevator(Floor chosenFloor) {
		this.currentFloor = groundFloor;
		this.chosenFloor = chosenFloor;
		this.maxFloor = 6;
		setMaxPeople(4);		
		
	}

	public int getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(int maxPeople) {
		this.maxPeople = maxPeople;
	}

}