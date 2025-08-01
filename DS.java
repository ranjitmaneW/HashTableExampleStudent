package java12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DS {

	public static void main(String[] args) {
		
		
		/*List<Integer> nums = Arrays.asList(5, 1, 3, 2);

		nums.stream()
		    .sorted()
		    .forEach(System.out::println);

	}*/
		
		
		List<Integer> num=Arrays.asList(7,8,0,12,9,4,4,8,2,4,3);
		num.stream()
		.sorted()
        .limit(5)  
		.forEach(System.out::print);
		
	}
}
