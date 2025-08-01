package java12;

import java.util.Hashtable;
import java.util.Map;

class Student{
	
	
	
	private int id;
	private String name;
	
	private String email;
	
	
	private String Address;
	
	private double Salary;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary)
	{
		Salary = salary;
	}

	public Student(int id, String name, String email, String address, double salary) 
	
	{
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		Address = address;
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", Address=" + Address + ", Salary="
				+ Salary + "]";
	}

	
	
	
	
	
}
	



public class MapStudentExample {

	public static void main(String[] args) {
		
		
		
		
		Map<Integer ,Student> student = new  Hashtable<>();
		
		student.put(101, new Student(101, "Ranjit", "maneranji01@gmail.com", "Dubai",9000));
		
		student.put(102, new Student(102, "Reena", "raveena02@gmail.com", "Iran", 45000)  );
		
		student.put(103, new Student(103, "Seema", "Seema03@gmail.com", "India", 30000));
		
		
		student.put(104, new Student(104, "pravin", "Pravin04@gmail.com", "wI", 80000));
		
		
		
		System.out.println("Display  All  Data  Of  Student ");
		
		
		
		for(Map.Entry<Integer,Student>  entry:student.entrySet() ) {
			
			System.out.println(entry.getValue());
			
			
		}
		
		//id wise get data
		
		int getid=101;
		
		
		System.out.println("Display  Student id:"+getid);
		
		Student student2 = student.get(getid);
		
		if(student2 !=null) {
			
		System.out.println(student2);	
			
		}
		else {
			
			System.out.println("Student Not Found .");
			
		}
		
		
		//Update Data id wise 
		
		if(student.containsKey(102)) {
			
			Student student3 = student.get(102);
			student3.setEmail("savita@gmail.com");
			student3.setName("Savita");
			
			
			System.out.println("Student new   data Updated  Id Wise");
			
			System.out.println(student3);
			
		}
		
		
		
		//delete data id wise
		
		
              if(student.containsKey(103)) {
            	  
            	  student.remove(103) ;
            	  System.out.println("\n Student with Id 1 deleted");
            	  
            	  
              }
		
		
		
		
		
		
		
		

	}

}
