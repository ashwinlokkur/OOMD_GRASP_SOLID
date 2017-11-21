import java.util.*;


public class addPatientsToDoctor{
	
	static Map<String,List<String>> mapdoc = new HashMap<String,List<String>>();//(doctor key,values are patients)

	static List<String> people = new ArrayList<String>();	
	Patient p;
	Doctor d;
	String pname = p.name;
	String dname = d.name;
	
	public static void addPatientsToDoctor(String pname,String dname){
		
		if(mapdoc.get(dname) ==  null){
			List<String> people1 = new ArrayList<String>();	
			people1.add(pname);
		    mapdoc.put(dname,people1);
		    System.out.println("Doctor " + dname + " is assigned to "+ pname);		
		}
		else
		{
			people = mapdoc.get(dname);
			people.add(pname);
		    mapdoc.put(dname,people);
		    System.out.println("Doctor " + dname + " is assigned to "+ pname);
		}
	}

	public static void doctor_patients(){
		List<String> keys = new ArrayList<String>(mapdoc.keySet());
		for (String key: keys)
		{	
	  			System.out.println("patients allocate to "+ key + " are : " + mapdoc.get(key));
	  		
		}
	}


	public static void seeAllotment(){
	 	 System.out.println(Arrays.asList(mapdoc));

	 }

}
