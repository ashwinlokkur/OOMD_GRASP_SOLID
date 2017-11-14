public class PersonFactory {
	public static Patient createPerson(String persontype, String name, int age) {
		return new Patient(name, age);
	}

	public static Doctor createPerson(String persontype, String name, int age, String sp) {
		return new Doctor(name, age, sp);
	}
}