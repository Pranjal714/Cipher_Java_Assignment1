import java.util.HashMap;
import java.util.Map.Entry;

class Employee{
	String Name;
	int year;
	String Address;
	
	Employee(String Name, int year, String Address) {
		this.Name=Name;
		this.year=year;
		this.Address=Address;
	}
	public String toString(){
		return(nt+Name+t+year+t+Address);
	}
	public static void main(String[] args) {
		Employee s1 = new Employee(Robert,1994, 64C-WallStreet);
		Employee s2 = new Employee(Sam,2000, 68D-WallStreet);
		Employee s3 = new Employee(John,1999, 26B-WallStreet);
		HashMapInteger, Employee map = new HashMap();
		map.put(1,s1);
		map.put(2,s2);
		map.put(3,s3);
		System.out.println(tNametYeartAddress);
		for(EntryInteger, Employee mmap.entrySet()) {
			System.out.println(m.getValue());
		}
	}
}