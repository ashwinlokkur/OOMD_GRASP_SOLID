import java.util.Random;

public class Doctor extends Person {
	
	public Doctor(String name, int age, String sp) {
		this.persontype = "doctor";
		this.name = name;
		this.age = age;
		this.sp = sp;
		this.id += new Random().nextInt(9999) + new Random().nextInt(9999);
		this.status = "active";
	}

	public static Person[] removeDoctor(Person[] doctorlist, int id) {
		for(int i = 0; i < doctorlist.length; i++) {
			if(doctorlist[i].id == id) {
				doctorlist[i].status = "removed";
				break;
			}
		}
		return doctorlist;
	}
}