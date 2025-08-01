package java12;

import java.util.ArrayList;


class Employee{
	
	private int id;
	
	
	private String name;
	private String email;
	private String address;
	private double sal;
	
	
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
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Employee(int id, String name, String email, String address, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", sal=" + sal
				+ "]";
	}
	
	
	
}


public class ArrayListEmp {

	public static void main(String[] args) {
		
		
		
	ArrayList <Employee>  emp =  new  ArrayList<>();
	emp.add(new Employee(1, "Ram", "maneranji09@gmail.com", "pune", 13000));
	emp.add(new Employee(2, "Raj", "raj09@gmail.com", "mumbai", 1200));
	emp.add(new Employee(3, "Seema", "seema01@gmail.com", "solapur", 20000));
	emp.add(new Employee(4, "sara", "sara03@gmail.com", "nagpur", 5000));
	

	System.out.println("All Employee List Display");
	
	for(Employee e:emp) 
	{
		
		System.out.println(e);
		
	}

	for (Employee e :emp) {
		if(e.getId()== 2) {
			
			e.setSal(35000);
		
			}
		}
	
	System.out.println("After Updated  Sal Data  Dispaly :=2");
	for(Employee e:emp) 
	{
		
		System.out.println(e);
		
	}
	
	
	
	int  seachid=4;

	System.out.println("Emp wise id   get Data  :=4"+seachid);
	
	
	
	for(Employee e:emp)
	{
		
		if(e.getId()==seachid) {
			
			System.out.println(e);

			
			
		}
		
		
		
		
	}


	
	
	
	
	

	emp.removeIf(e-> e.getId()==1)  ;

	
	System.out.println("After Updated Deleted Data  Dispaly := 1");

	for(Employee e:emp) 
	{
		
		System.out.println(e);
		
	}

	
	System.out.println("After Updated c Sal Data  Dispaly");

	}

}
