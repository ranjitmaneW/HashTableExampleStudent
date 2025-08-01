package java12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8streamApi {

	public static void main(String[] args) {
		
		
		
	   List<String>  Emplist =  Arrays.asList("Ranjit ","Ranveer");
		List<String>  up=Emplist.stream()
		.filter(s-> s.startsWith("R") ) 
		.map(String::toUpperCase)
		.collect(Collectors.toList());
		
         System.out.println(up);



       
       // List<Integer>   num= Arrays.asList(2,7,9,3,5,10,11,4,6,5,4,9,1,2,3)  ;
        
      /*  Stream<Integer> stream = num.stream();
        stream.filter(n -> n % 2==0)
        .forEach(System.out::println);
        
        
        
*/   /*               
      num.stream()
     .distinct()
     .forEach(System.out::println);
     
        */
        
      /*  
        num.stream()
        .limit(3)
        .forEach(System.out::println);
        */
        
        
        List<Integer>   num= Arrays.asList(2,7,9,3,5,10)  ;
        num.stream()
.skip(4)
.forEach(System.out::println);
        

	}
	
}







/*

List<String> names = Arrays.asList("John", "Alice", "Bob");

// Use stream to filter and map
List<String> result = names.stream()
                           .filter(s -> s.startsWith("A"))   // Keep only names starting with "A"
                           .map(String::toUpperCase)         // Convert to upper case
                           .collect(Collectors.toList());    // Collect into list

// Print final result
System.out.println(result);
}
	}*/


