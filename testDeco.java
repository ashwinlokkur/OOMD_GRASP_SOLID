public class testDeco {

	public static void main(String[] args) {
		Room test_icu = new ICURoom(new BasicRoom());
		test_icu.assign();
		System.out.println("Done with onei assignment\n");
		Room test_shared_icu = new ICURoom(new SharedRoom(new BasicRoom()));
		test_shared_icu.assign();
		System.out.println("Done with the second assignment\n");
	}

}
