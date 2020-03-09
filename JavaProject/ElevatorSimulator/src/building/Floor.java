package building;

public abstract class Floor {
	int floorNo;
	int currentFloor;
	
	public Floor() {
		
		int[] floorNo = new int[7];
		floorNo[0] = 0;
		
	}
	
	public String toString(){
		return floorNo + "";
	}

}
