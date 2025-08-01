package java12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product{
	
	
	private String name;
	private double price;
	private int quantity;
	
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
}



public class ProductInfoUseMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String , Product> prodata= new HashMap<String, Product>();
		
		prodata.put("P101",new Product("Milk", 25.20, 12));
		
		prodata.put("P102",new Product("Bread", 30.2, 32));
		prodata.put("P103",new Product("Eggs", 55.30, 4));
		
		
		System.out.println("Add product data info Display");
		
		for (Map.Entry<String, Product> entry: prodata.entrySet())
		{
			
			System.out.println(" All data"+ entry.getKey()+"  Values"+entry.getValue());
			
			
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product code to view Details:");
		
		String code= scanner.nextLine();
		
		
		if(prodata.containsKey(code)) {
			
			 Product product = prodata.get(code);
			 
			 System.out.println("product found");
			 
			 System.out.println("Name"+product.getName());
			 System.out.println("Price"+product.getPrice());
			 System.out.println("Quintatity"+ product.getQuantity());
		}else {
			
			
			System.out.println("Product Not Found");
			
			
			
		}
			
		}
		


	}


