package java12;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person1  extends Ca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 b = new   Person1();
		
		            System.out.println(b.a);

		
	              LocalDate date = LocalDate.now();
	     System.out.println(date);
	
	          LocalDateTime future = date.plusDays(2).plusYears(3).atStartOfDay();
        System.out.println("Future DateTime: " + future);
     

	
	
	
	}

}
