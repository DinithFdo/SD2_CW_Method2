package task1;

public class Room {
	
	int roomNum;
	boolean isRoomEmpty;
	Customer [] customers;
	
	Room(){
		
	}
	
	Room(boolean isCabinEmpty){
		this.isRoomEmpty = isCabinEmpty;
	}
	
	Room(Customer[] customers,int roomNum,boolean isRoomEmpty){
		this.customers = customers;
		this.roomNum = roomNum;
		this.isRoomEmpty = isRoomEmpty;
	}
	
	public void setRoomStatus(boolean isRoomEmpty) {
		this.isRoomEmpty = isRoomEmpty;
	}
	
	

}
