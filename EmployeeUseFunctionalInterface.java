package java12;

import java.util.function.Function;
import java.util.function.Predicate;


public class EmployeeUseFunctionalInterface {

	public static void main(String[] args) {
		
	/*	
		Predicate<Integer> isPositive = n -> n > 0;
		System.out.println(isPositive.test(10)); // true

		*/
		
		
		
		/*Predicate<Integer>isPositive= n-> n>0;
		System.out.println(isPositive.test(-20));
*/
		
		/*Predicate<Integer> isPositive = n -> n > 0;
		Predicate<Integer> isEven = n -> n % 2 == 0;

		Predicate<Integer> isPositiveAndEven = isPositive.and(isEven);

		System.out.println(isPositiveAndEven.test(4));  // true
		System.out.println(isPositiveAndEven.test(-4)); // false
		System.out.println(isPositiveAndEven.test(3));  // false

		*/
		
		/*
		Predicate<Integer>isPostiveNum = n-> n>0;
		Predicate<Integer>isEvemNum= n-> n%2==0;
		
		Predicate<Integer>isPostiveNumAndisEvemNum= isPostiveNum.and(isEvemNum);
		
		System.out.println(isPostiveNumAndisEvemNum.test(-4));
		
		*/
		
		
		
		/*
		
		Predicate<String> startsWithA = s -> s.startsWith("A");
		Predicate<String> endsWithX = s -> s.endsWith("x");

		Predicate<String> startsWithAOrEndsWithX = startsWithA.or(endsWithX);

		System.out.println(startsWithAOrEndsWithX.test("Alex"));  // true (starts with A and ends with x)
		System.out.println(startsWithAOrEndsWithX.test("Max"));   // true (ends with x)
		System.out.println(startsWithAOrEndsWithX.test("John"));  // false

		
		
		*/
	/*	
		Predicate<String>  startsWithR= m->m.startsWith("R");
		
		Predicate<String>endsWithT= t->t.endsWith("t");
		
		Predicate<String>startsWithRorendsWithT=startsWithR.or(endsWithT);
		System.out.println(startsWithRorendsWithT.test("RanjiT"));
		System.out.println(startsWithRorendsWithT.test("Reen"));
		System.out.println(startsWithRorendsWithT.test("ahat"));
		System.out.println(startsWithRorendsWithT.test("Seema"));
		System.out.println(startsWithRorendsWithT.test("geet"));


*/
	/*	Predicate<Integer> isEven = n -> n % 2 == 0;
		Predicate<Integer> isOdd = isEven.negate();

		System.out.println(isOdd.test(5));  // true
		System.out.println(isOdd.test(8));  // false
		
		*/
		/*
		Predicate<Integer> isEven = n-> n%2==0;
		Predicate<Integer>isodd=isEven.negate();
		System.out.println(isodd.test(8));
		*/
		
		/*
		Predicate<String> isHello = Predicate.isEqual("Hello");

		System.out.println(isHello.test("Hello")); // true
		
		System.out.println(isHello.test("Hi"));    // false

		System.out.println(isHello.test("Hello")); // true

		*/
	/*	Predicate<String>isNameSameObj=Predicate.isEqual("Ram");
		System.out.println(isNameSameObj.test("raj"));
		System.out.println(isNameSameObj.test("Ram"));
		System.out.println(isNameSameObj.test("ram"));

		
		*/
	/*	
		  // Create a Function that converts String to its length
        Function<String, Integer> strLength = s -> s.length();

        // Apply the function
        Integer len = strLength.apply("HelloWorldram");

        // Print the length
        System.out.println(len);
        
        */
        
/*
           Function<String, Integer> strlengthofMyvar=s->s.length();
           Integer lenVar = strlengthofMyvar.apply("Raj");
           System.out.println(lenVar);
		
           */
      /*     Function<Integer, Integer> square = n -> n * n;

           System.out.println(square.apply(5)); // 25
           System.out.println(square.apply(8)); // 64
           
           Function<Integer, Integer> sql =  n-> n*n;
           System.out.println(sql.apply(89));
           */
		/*
		 Function<Integer, Integer>  square= n-> n*n;
		 System.out.println(square.apply(11));
		
          */ 
		
		
		
		/* // First function: Convert String to Integer (get length)
        Function<String, Integer> stringLength = s -> s.length();

        // Second function: Square the number
        Function<Integer, Integer> square = n -> n * n;

        // Combine them using andThen
        Function<String, Integer> lengthThenSquare = stringLength.andThen(square);

        // Apply on a string
        Integer result = lengthThenSquare.apply("Hello");

        // Print
        System.out.println(result);
        
        */
     /*   Function<String, Integer> stringlength = s-> s.length();
        
        System.out.println(stringlength.apply("application"));
        Function<Integer, Integer> squ=s->s*s;
        
        System.out.println(squ.apply(4));
        
        Function<String, Integer>stringlengthansqu= stringlength.andThen(squ);
        Integer apply = stringlengthansqu.apply("app");
        System.out.println(apply);
        
        
        */
		
		
		
		/*
		
		 Function<Integer, Integer> multiplyBy2 = n -> n * 2;

	        // Before function: Add 10
	        Function<Integer, Integer> add10 = n -> n + 10;

	        // Compose: first add10, then multiplyBy2
	        Function<Integer, Integer> composed = multiplyBy2.compose(add10);

	        // Apply
	        Integer result = composed.apply(5);

	        // Print
	        System.out.println(result);
	        
	      
	        
	        
	        */
		
		
		
	/*	// This function: Multiply by 2
        Function<Integer, Integer> multiplyBy2 = n -> n * 2;

        // Before function: Add 10
        Function<Integer, Integer> add10 = n -> n + 10;

        // Compose: first add10, then multiplyBy2
        Function<Integer, Integer> composed = multiplyBy2.compose(add10);

        // Apply
        Integer result = composed.apply(5);

        // Print
        System.out.println(result);
        
        */
        
        Function<Integer, Integer> multiplyBy2 = n->n*2;
        
        Function<Integer ,Integer> add2=n->n+10;
        
        Function<Integer, Integer> composed =multiplyBy2.compose(add2);
        Integer apply = composed.apply(4);
        System.out.println(apply);
        
        
        
        
        
    }
		
		
	        
	        
        
    }
		
		
		
           
		
	







/*



🎯 Question
Create a Java program using Java 8 only features (Functional interfaces, Stream API, lambda) to perform the following tasks on an Employee list.

✅ Employee class requirements
Define an Employee class with fields:

name 

salary

department 

mobile 

email 

✅ Tasks
1️⃣ Print all employee details using a Functional interface and lambda expression.

2️⃣ Sort all employees by salary in ascending order and print the result.

3️⃣ Group all employees by department and print each department along with the list of employees in it.

4️⃣ Sort all employees by name in alphabetical order and print the result





=== All Employees ===
Employee details...

=== Sorted by Salary ===
Employee details...

=== Grouped by Department ===
Department: IT
Employee details...

Department: HR
Employee details...

Department: Finance
Employee details...

=== Sorted by Name ===
Employee details...


*/





//https://meet.google.com/bpv-tfgn-ugs






