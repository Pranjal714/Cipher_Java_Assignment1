import java.util.LinkedList;

public class Employee1  {
	
  static  class Employee{
        int empId, empSalary;
        String empName, empDesignation, empLocation;

        public Employee(int empId, String empName, String empDesignation, int empSalary, String empLocation){
        	this.empId = empId;
            this.empName = empName;
            this.empDesignation = empDesignation;
            this.empSalary = empSalary;
            this.empLocation = empLocation;
        }
        public int getEmpId() {
            return empId;
        }

        public int getEmpSalary() {
            return empSalary;
        }

        public String getEmpName() {
            return empName;
        }

        public String getEmpDesignation() {
            return empDesignation;
        }
        
        public String getEmpLocation() {
            return empLocation;
        }
    }

    public static void main(String[] args) {
        LinkedList<Employee> list = new LinkedList<>();
        Employee employee1 =new Employee(1,"John","Devloper",60000,"America");
        Employee employee2=new Employee(2,"Sam","Tester",40000,"Hawaii");
        Employee employee3=new Employee(3,"jack","Cyber",30000,"Manhattan");
        Employee employee4=new Employee(4,"Dwyane","Sale",70000,"Denmark");
        Employee employee5=new Employee(5,"Pop","ML Devloper",80000,"Moscow");
        Employee employee6=new Employee(6,"Matt","Technical",30000,"New York");
        Employee employee7=new Employee(7,"Vice","Technical",30000,"Sydney");
        Employee employee8=new Employee(8,"Brian","Technical",30000,"Banglore");
        Employee employee9=new Employee(9,"Luke","Technical",30000,"Banglore");
        Employee employee10=new Employee(10,"Jake","Technical",30000,"Banglore");

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        list.add(employee6);
        list.add(employee7);
        list.add(employee8);
        list.add(employee9);
        list.add(employee10);
        
        
        System.out.println("All names of employees");
        list.stream().forEach(e->{
            System.out.println(e.getEmpName());
        });
        System.out.println("\n All salaries greater than 50,000/-");
        list.stream().filter(e->e.getEmpSalary()>50000).forEach(e->{
            System.out.println(String.format(e.getEmpName()+" "+e.getEmpSalary()));
        });
        System.out.println("\n All locations starting with letter \'M\'");
        list.stream().filter(e->e.getEmpLocation().startsWith("M")).forEach(e->{
            System.out.println(String.format(e.getEmpName()+" "+e.getEmpLocation()));

        });
        System.out.println("\n All designations stating with \'E\'");
        list.stream().filter(e->e.getEmpDesignation().endsWith("E")).forEach(e->{
            System.out.println(String.format(e.getEmpName()+" "+e.getEmpDesignation()));

        });
    }

}