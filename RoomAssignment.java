public class RoomAssignment implements Room {

	protected Room room;
	
	public RoomAssignment(Room r){
		this.room=r;
	}
	
	@Override
	public void assign() {
		this.room.assign();
	}

}
