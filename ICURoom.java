public class ICURoom extends RoomAssignment {

	public ICURoom(Room r) {
		super(r);
	}

	@Override
	public void assign(){
		super.assign();
		System.out.print("Assigning patient to Intensive Care Unit\n");
	}
}