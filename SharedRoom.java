public class SharedRoom extends RoomAssignment {

	public SharedRoom(Room r) {
		super(r);
	}
	
	@Override
	public void assign(){
		super.assign();
		System.out.print("Assigning patient to a Shared Room\n");
	}
}
