import java.util.Random;
public class Patient extends Person {
	
	public Patient(String name, int age) {
		this.persontype = "patient";
		this.name = name;
		this.age = age;
		this.id += new Random().nextInt(9999) + new Random().nextInt(9999);
		this.status = "admitted";
	}

	public static Person[] dischargePatient(Person[] patientlist, int id) {
		for(int i = 0; i < patientlist.length; i++) {
			if(patientlist[i].id == id) {
				patientlist[i].status = "discharged";
				break;
			}
		}
		return patientlist;
	}


}