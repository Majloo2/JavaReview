package Java.Practice2023.java;


import java.util.ArrayList;

//Instance Method must be created outside the public class which is outside the main method as well
//Created two and placed both outside the class brackets (one at the top of this page named "Car", and one at the bottom of the page called "ClientLead""

//Instance Method to create Object/Objects
class Car{
	String cartype;
	int carYear;
}
	
//Created a Class Method/Instance Method (Must be created outside the "public class") in order to create a Custom Object	
	
//Class Name: JavaBasics
public class JavaBasics {	
	
	
	// We cannot declare any method inside the main method {public static void main(String[]args)}.
	// However, we can create methods outside the the main method But MUST be in the class-level / { }. Otherwise it will cause errors.	
	
	
	
	
	//----------------------------------------- Methods with changeable parameter ----------------------------------------------//
	
	
	//Example: 
// Created a Method with parameters. It is outside the main Method, But still in the public class level.
	
	
// private -> give no access to other classes	// (String  -> Parameter, int -> Parameter)
	private static void methodWithParameter_Str_integar(String statement,int age) {
 	
		String message = statement;
// String=DataType.  message=Variable. statement= Value (since we have a parameter it means the value is changeable and set as a string value (text)	
		
		int clientAge = age;
		// When we call this void method with parameters below(in the main method) system.out.printIn will print out the input we insert 
		System.out.println(statement+""+ age);
	}
	
	//If we are trying to run a configuration without using TestNG we have to create a "Main" method and must be called "main" 

	//-------------------Main Method--------------------------// 
public static void main(String[] args) throws Exception  {
	
		
	
	//---------------Calling the Method with Parameter that we created outside the main Method--------------------- //

	
	// Calling the name of the method -> ( String "   statement     ", int "age")
	methodWithParameter_Str_integar("Life still not easy at the age ", 32);
	
	// it should print out what's inside the parentheses/round brackets ( ), since we included syso. in the method itself.	

			
	
	
	//------------------------------------------- Data Types --------------------------------------------------------------//
	
				// ******* Data types examples: int, String, float char, boolean, double, long, byte, Enum, array *********

	
									// Data types categories are: A)Primitive and B) non-Primitive:
					
				// A) Primitive such as int, float, char, double, long, byte -> starts with a lowercase letter.
	
				// B) Non-primitive such as String, class objects, custom objects, Enums, arrays -> starts with an uppercase letter.
		

		
		

		
		
		
		
		//										Simplified with Examples
		// ------------------------ First - Terminology BreakDown with Examples ------------------------------------------------------------------//
		
		
		
// String -> Data Type.		firstName_ -> Variable.		"Zee" -> Value.    ; -> semicolon (which terminates/closes the statement)
String firstName_ = "Zee";
System.out.println(firstName_);






//int -> Data Type.		xp -> Variable.		7 -> Value.    ; -> semicolon (which terminates/closes the statement)
int xp = 7;
System.out.println(xp-7);		








// ---------------------------------------------OBJECTS Terminology and Explanation-------------------------------------------------------------//


// First -> There are Objects you can import from libraries like selenium , apache etc.
// Second -> You can create your own Object which is called Custom Objects.


// Creating a new object using the class-method (Instance-Method) that was created above {ClientInfo} 	
ClientLead client = new ClientLead();
client.age = 65;
client.fullName = "Ahmad Ketaneh";
System.out.println("Hey "+ client.fullName + " since you are " + client.age + " you qualify for the senior forgivness loan which is considered B.S!! ");

Car car = new Car();
car.cartype= "Kia";

System.err.println(client.fullName+ " you are " + client.age + " years old" + " and still driving a "+car.cartype+"?? you need to get a life! or we can finance you and screw your life even much more!"  );
		
		
		
// Integer data types are: [ byte, short, int, long ] Below are some examples:

		
		
		// The byte data type can store whole numbers from -128 to 127
		byte myNum22 = 100;
		System.out
				.println("byte data type stores numbers from -128 to 127 and this is the selected number --> " + myNum22);

		
		
		
		// The short data type can store whole numbers from -32768 to 32767:
		short myShortNum = 5000;

		System.out.println(myShortNum);

		
		
		
		
		// int = stores integers/whole numbers without decimals
		// int - 4 bytes - Stores whole numbers from (-2,147,483,648) to (2,147,483,647)
		// we can use int to do basic math opertations as well
		int xs = -2147483648;
		int xyz = 80 % 33;
		System.out.println(" % Returns the division remainder 80%33 --> " + xyz);
		int s = 7 + (16000 * 20000);
		System.out.println(s + xs);

		
		
		
		
		
		// long - 8 bytes - Stores whole numbers from (-9,223,372,036,854,775,808) to
		// (9,223,372,036,854,775,807)
		// Note that you should end the value with an "L":
		long MyNumber = 7343538000L;
		System.out.println("this is a phone number: " + MyNumber);
		

		
		
		
		
		
		// floating types are float & double
		// float - 4 bytes - Stores fractional numbers. Sufficient for storing 6 to 7
		// decimal digits
		// Note that you should end the value with an "f":
		float floatNumber = 79.1234567f;
		System.out.println(floatNumber);
		
		
		
		
		// A floating point number can also be a scientific number with an "e" to
				// indicate the power of 10:
				float f1 = 35e3f;
				double d1 = 12E4d;
				System.out.println(f1);
				System.out.println(d1);
				
				
				
				
				
		

		// double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal
		// digits
		double doubleDecimal = 19.155555555d;
		System.out.println(doubleDecimal);

		
		
		
		
		
		
		
		

		// -------------------------Java Type Casting (Changing/Switching DataType sizes) ---------------------------------------//

		
		
		// Widening Casting (automatically) - converting a smaller type to a larger type
		// size
		// byte -> short -> char -> int -> long -> float -> double

		// Narrowing Casting (manually) - converting a larger type to a smaller size
		// type
		// double -> float -> long -> int -> char -> short -> byte

		int myInt = 9;
		double myDouble = myInt;

		System.out.println(myInt); // Outputs 9
		System.out.println(myDouble); // Outputs 9.0

		System.out.println("value with decimal");
		double myDouble2 = 9.78d;
		int myInt2 = (int) myDouble2; // Manual casting: double to int

		System.out.println("Original value of Double before casting it to integar ----> "+myDouble2); // Outputs 9.78
		System.out.println("NEW value of Double AFTER casting it to integar ----> "+myInt2); // Outputs 9

		// ---------------------------------------------------------------------------------------//

		// char - 2bytes - Stores a single character/letter or ASCII values
		// used to represent a single character, such as a letter, digit, or special
		// symbol
		// char value is type between single quotes

		char symbol = '@';
		char middleInitial = 'M';
		char pick_A_number_from_ZeroToNine = '0';

		System.out.println(symbol + middleInitial + pick_A_number_from_ZeroToNine);

		//((American Standard Code for Information Interchange)) ASCII values, you can use those to display certain characters:
		
		
		
		System.out.println("------------------------------MyVar Under--------------------------");

		char myVar1 = 65, myVar2 = 66, myVar3 = 67;
		System.out.println(myVar1); // prints A
		System.out.println(myVar2); // prints B
		System.out.println(myVar3); // prints C

		
		/* More Value examples: 
		 * Character: 'A', ASCII Value: 65 
		 * Character: 'a', ASCII Value: 97 
		 * Character: '0', ASCII Value: 48 
		 * Character: '$', ASCII Value: 36
		 * Character: '!', ASCII Value: 33 
		 * Character: ' ', ASCII Value: 32 (Space)
		 */
		
		
		
		
		
		//----------------------------------------------STRING--------------------------------------------------------------------//
		
		
		
		
		
		
		// String = stores texts -> carName is Variable name -> BMW is the value
		// String is a reference data type that behaves somewhat like an object

		String carName = "Bmw";
		System.out.println(carName);

		String lowerCaseName = carName.toLowerCase();
		String capitalLetters = carName.toUpperCase();

		System.out.println("this is the capital letter version ---> " + capitalLetters);
		System.out.println("this is the lower case version ---> " + lowerCaseName);

		String firstName = "Ahmad ";
		String lastName = "Ketaneh";
		System.out.println(firstName + lastName);
		// or we can print it without using the + sign by using concat
		System.out.println(firstName.concat(lastName));

		// how to insert a quotation in a printIn text
		// print this: "I think that i'm somewhat "ready" for the market" [ \" = Double
		// quote , \' = Single quote ]
		System.out.println("I think that i'm somewhat \"ready\" for the market");

		// print this: "I want the "A sauce\dip" on my stake " \\ = \ (Backlash)
		System.out.println("I want the 'A sauce\\dip' on my stake");

		// locating text index/OrderNumber in the sentence
		String txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate"));

		// Escape sequences:
		// \n New Line
		// \r Carriage Return
		// \t Tab
		// \b Backspace
		// \f Form Feed
		System.out.println(
				"Trying Escape sequnces like New line and Backspace etc..  refer to Line-156 ----------------");
		System.out.println("I think\n that i'm somewhat \"ready\" for\t the market, so I have\f applied for \rone job");

		
		
		
		
		
		
		
		

// ----------------------------------------------------- Math operations --------------------------------------------------------------------------//
	
		
		
		
		System.out.println("MATH OPERATIONS --------- BELOW----------------------------------:D------------");
		int N = 9, M = 7, Z = -3, D = -20;
		
		//Math.max will pick maximum/largest input
		int equation1 = Math.max(N, M);
		int equation1_1 = Math.max(D, Z);
		
		//Math.min picks the minimum number in the input
		int equation2 = Math.min(equation1, Z);
		
		
		//Math.subtract it only subtracts small numbers from large number: example 4-2 would give a result, but (2-4) java will output/print.out ->  "ArithmeticException"
		int equation3 = Math.subtractExact(Z, equation2);
	
		//Math.sqrt gives the square root of the given number/int/input
		double equation4 = Math.sqrt(equation3);
		
		//Math.random() selects a random number
		double equation5 = Math.random() * 200;

	
		System.out.println("Eq1 -- Maximun number --> " + equation1);
		System.out.println("Eq1_1 -- Max number D or Z ----->" + equation1_1);
		System.out.println("Eq2 -- Minimum number --> " + equation2);
		System.out.println("Eq3 -- Subtrack exact Z(-3) from Eq2 --> " + equation3 * -1);
		System.out.println("Eq4 -- Sqrt of Eq3 result -- > " + equation4);
		System.out.println("Eq5 -- Random number from 0 to 200 " + equation5);
		
		
		System.out.println("Without using int or double. This is straight from Syso PrintIn ----> Absolute value= "+ Math.abs(7 * -40.7));

		
		
		
		
		
		
		
		
		
		
		
		
					// ------------------------- Assignment Operators---------------------------------------//

		
System.out.println(	"------------------------------------- Assignment Operators ----------------------------------------------");

		

		
		// Assignment Operators:
		// += , -=, *=, /=, %=, &=, |=, ^=, >>=, <<=
		
		
		
		
		//   Operator: 			Example: 				Same As: //
		// 		= 				x = 5 					x = 5
		// 		+= 				x += 3 					x = x + 3
		// 		-= 				x -= 3 					x = x - 3
		// 		*= 				x *= 3 			 		x = x * 3
		// 		/= 				x /= 3					x = x / 3
		// 		%= 				x %= 3 					x = x % 3
		// 		&= 				x &= 3 					x = x & 3
		// 		|= 				x |= 3 					x = x | 3
		// 		^= 				x ^= 3 					x = x ^ 3
		// 		>>= 			x >>= 3 				x = x >> 3
		// 		<<= 			x <<= 3 				x = x << 3
		
		//Example from above: 
		//	Using: 		-= 				x -= 3 					x = x - 3
		int x = 1;
		int o = 1;
		
// We created different variables so result1 & result2 don't interfere with each other, if we use the same variable it will fluctuate.
		int result1 = (x -= 3);
		int result2 = (o = o - 3);
		System.out.println(result1);
		System.out.println(result2);
		
		
//We can also check if it worked by using ->  ==  
		System.out.println("The results 1&2 are equal? T/F " +  (result1==result2));
		
		
		
//Another way to check and print it in RED color (using system.err.printIn) if its false
//Green color printIn code/ChatGPT   
String green = "\u001B[32m";
		


		// if-else statement 
		
		if (result1 == result2) {
			System.out.println(green+"Yes they are the same. Assignment operators do function properly");
		}
		else { System.err.println("Reuslts are not the same, Do not listen to W3 school");
			
		}
		
//Resetting color back to normal/black:
		String reset = "\u001B[0m";
		System.out.println(reset+"Resetting font color to Black");
		
		 
		 
	

		
		
		
		
		
		
		
		
		
// -------------------------------------- Boolean & its' expressions---------------------------------------------------------------------------------//

		 
		 
		 
		 
		// boolean Main goal is Storing true or false values
		boolean isJavaFun = true;
		boolean isFishTasty = false;

		System.out.println(isJavaFun);
		System.out.println(isFishTasty);
		Thread.sleep(2000);

		int Q = (2 * 4) + (7 ^ 2);
		int W = (3 * 30) - (4 * 4);
		System.out.println("A " + (Q < W));

		System.out.println("B " + (Q > W));
		System.err.println("C " + (W == Q));
		System.out.println("D " + (Q <= W));
		System.err.println("E " + (Q >= W));
		// System.out.println(Main.class.getCanonicalName());
		// System.out.println(Class.forName(lastName));

		System.out.println("---------IF-------Else------");
		
		
		
		// Example Below:
		// Create a statement to set greeting just by changing the data-type value
		// Representing a 24hour clock instead of am and pm.
		
		
		//Used float so we can enter decimals:
		float GreetingBasedOntimeIn24HourSpanIs = 5.99f;

		if (GreetingBasedOntimeIn24HourSpanIs >= 7 && GreetingBasedOntimeIn24HourSpanIs <= 12) {
			System.err.println("Good morning.");
		}

		else if (GreetingBasedOntimeIn24HourSpanIs >12 && GreetingBasedOntimeIn24HourSpanIs <= 16) {
			System.err.println("Good afternoon.");
		}

		else if (GreetingBasedOntimeIn24HourSpanIs >16 && GreetingBasedOntimeIn24HourSpanIs < 18) {
			System.err.println("Good evening.");
		}

		else {
			System.err.println("We are currently Closed, Please call back during normal business hours");
		}

		// Explanation of the method above:
		// The method says if the time is less than 12 greet with good morning,
		// And if the time is less than 16 which is 4pm then greet with Good Afternoon
		// And if the time is less than 18 which is 6pm then greet with Good Evening
		// And if its any other time, let them know that we are closed.

		
		
	// 		&& -> Logical and -> Returns true if both statements are true -> x < 5 && x <
	// 		10

	// 		|| -> Logical or  -> Returns true if one of the statements is true ->    x < 5 || x
	// 		< 4

	// 		! -> Logical not  -> Reverse the result -> returns false if the result is true
	// 		!(x < 5 && x < 10)
		
		
		
		
		
		
// --------------------------------- Boolean WITH if,else if ----------------------------------------------//
		
		

		
// int applicantAge value determines the printIn based on the conditions outcome(System PrintIn):
				
	// Applicant Info to change
		String ApplicantName = "Saja Ketaneh";
		int applicantAge = 36;
		boolean isAmerican = false;
		boolean isNotAmerican = true;
		
		
// we didn't declare int age value so it can be changed/updated based on applicantAge above
		int age = applicantAge; 

// Declared based on inputs above
		boolean isCitizen = isAmerican;
		boolean notCitizen = isNotAmerican;
		
		

		if (age >= 18 && isCitizen) {
			System.out.println(ApplicantName+" "+"You are eligible to vote.");
		} else if (age >= 18 && notCitizen) {

			System.err.println(ApplicantName+" "+
					"You are over the legal age to vote.. But unfortunately you must be a U.S citizen to vote");
		}

		else if (age < 18 && isCitizen) {
			System.err.println(ApplicantName+" "+
					"Your voice does matter but the law requires that citizens must be 18yrs of age and older to be eligible to vote. Please try again when you are over the age of 18. Have a wonderful day!");
		}

		else if (age < 18 && notCitizen) {
			System.err.println(
					ApplicantName+" "+"Voting rules requires you to be over the age 18 and must be a U.S citizen. What the heck are you doing here! You don't even fit in one category!");
		}

		
	
		
		
		
		
		
		
		
// ------------------- Conditional Statements ----------------------------------------//
		
		
		
		
		 
	// reminder "if else" is not a data type - its a conditional statement 
	// Shortcut for "if else" conditional statement syntax
		
		
		 int time = 20;
		    String result;
		    						   	 // -> : symbol means else
		    					//  If  True   :   If  False
		    result = (time < 24) ? "Good day." : "Good evening.";
		    System.out.println(result);
		
		
		
	// Switch conditional statement
				
		
		 // We can switch value(#) to the case number that matches our wanted month. For example, September printIn is under Case#9 so we place 9 in the int value.
	// int-> DataType 	 Month-> Variable 		7 -> Value
		    
		    
		    							System.out.println("----------------switch conditional statement-------------");
		    int Month = 17;
		    switch (Month) {
		      case 1:
		        System.out.println("Jan");
		        break;
		      case 2:
		        System.out.println("Feb");
		        break;
		      case 3:
		        System.out.println("Mar");
		        break;
		      case 4:
		        System.out.println("Apr");
		        break;
		      case 5:
		        System.out.println("May");
		        break;
		      case 6:
		        System.out.println("June");
		        break;
		      case 7:
		        System.out.println("July");
		        break;
		      case 8:
			    System.out.println("Aug");
			    break;
		      case 9:
			    System.out.println("Sep");
			    break;
		      case 10:
			    System.out.println("Oct");
			    break;
		      case 11:
			    System.out.println("Nov");
			    break;
		      case 12:
			    System.out.println("Dec");
			    break;
			   default: System.err.println("Please pick a valid month");
		    }
		  
			
	
		
//--------------------------------------------- while loop & do-while loop & for loop --------------------------------------------//
		    System.out.println("----------------while loop & do-while loop & for loop-------------");
		   
		    
		    
		    
		    //In a "while" loop, the loop condition is checked before entering the loop. 
		    //If the condition is false from the beginning, the loop will not execute its block of code.
		    
		    //Changing color to green so if the while loop is correct it would print in green - Doing it because it's easier to locate
		    String greenFont = "\u001B[32m";
		    
 //Syntax/Structure -> 	while(condition) { 'Code black'}
		    
		    int i = 20;
		    while (i <= 24) {
		      System.out.println(greenFont+i++);
		    
		    }  
		   
		    
		    //changing font color back to black/original color
		    String resetFontToOrginial = "\u001B[0m";  
		    System.out.println(resetFontToOrginial);
	
		    
		    
		
		    
		    
		    //-------  do-while loop --------//	    
		   
		//A "do-while" loop first executes the block of code within the loop and then checks the loop condition. 
		//This means that the block of code is guaranteed to execute at least once, even if the loop condition is initially false
		    // In this example it should print the value of i2 regardless if the loop is true or false
		   
	
		    
 //		Syntax ->  do { 'Code blcok' } while (condition);
		    
		    int i2 = 100;
		    
		    do {
		      System.out.println(i2++);		
		    
		    }
		    while (i2<90);

		    
		    
		    
		    
		    System.out.println("--------------------------------for loop examples----------------------------------------");
		    
		    						
		    						//-------------------- 	for loop ----------------------------//
		    
		  //Syntax ->    for (initialization; condition; iteration) { 'Code block' }
		    
		    // n has value of 10 which is the starting counter
		    // n<18 is the condition, if condition is true loop starts until it reaches the false condition to stop
		    // ++ increment operator that keeps increasing value of the variable (n) by 1. 
		    for(int n = 10; n<18; n++) {
		    // condition is true in this example because 10 is less than 18
		    // 	it shoud print numbers from 10 to 17 and stop. it won't print over 17 because the condition will be false for example: (18 is not less than 18).
		    	System.out.println(n);
		    }
		    
		    
		    
		    
		    
		    
		    

		   
		    
		 // Another example - using long integar data type 
		 // long z = 2 --> setting up a counter or starting value of 2.
		    
		    for(long z = 2; z<10; z++ ) {
/*for (Starting value is 2; z<10 -> condition: if its true it will continue/if not it will stop the loop; 
        z++: if conidtion is true, then increment the loop variable(z) by 1 after each iteration/cycle until it reaches false conidtion;)
				 */  
		        		    	   	
				 System.out.println("\n\niteration results -----> " + z); // if conidtion is true, it will print all of the iterations results 
				 
				 
				 //additional step Not needed! we can use system.out.printIn math operations
				 
				 // Declaring an integar variable - must match the integar type created in the for loop - we used long so it must be long as well
				 long finalValue = z/2;	 
				 
				
				 System.err.println("\nIteration result divided by 2 = --> " + finalValue);
	        
				 // System.out.println(z/2); would give us the same result
				 System.out.println("\nUsing SYSO to divide by 2 'No Variable' -->  "+ z/2);		    
		    }		    
		    
		    
		    
		    
		    
		    
		    int multiplier = 5; // The number for which we want the multiplication table
	        int range = 10;     // The range of numbers for the table
	        
	        // we can use any Integar depends on the requirements that we are trying to meet
		    for (int i3 = 1; i3 <= range; i3++) {
	            int theResult = multiplier * i3;
	            //  \n - sequence -> line break 
	            System.out.println("\nfor loop print out --->  "+multiplier + " * " + i3 + " = " + theResult);
	            System.out.println("for loop Result Only ---> " + theResult);
	            
		    }
		    
		    
		    
		    // using  ( += assignment operator) instead of increment(++) or decrement(--) operators 
		    // r += 1 means --> r = r+1
		    
		    
		    
// setting multiple rules in a condition using(&&): [r > 0, and r is less than or equals to 20, and r is less than 100/6.7],
// 																		  r += 1 -->  r = r+1 which will result in the same as r++
		    
			   for (int r = 4; 		r > 0   &&  r<=20   && 	r<100/6.7;		 r += 1) {
			        System.out.println("\nusing && condition, and using +=1 instead of (++) ===>  "+ r);
			        }   
		        
// we can use r += 2 or r = r+2 --> that way it will increment the value by 2 in each iteration until the condition reaches false to stop the loop	    
		    
	        
			   
			   
			   // ----------------------------for loop further detailed explaination -- If needed -----------------------------------------//
				/*
				 * 1) Initialization: You start by setting up a counter (i3 in the example above) to a starting value.
				 
				 * 2) Condition: Then you set a condition that says,
				 * "Keep doing the task as long as this condition is true." This condition
				 * involves checking if the counter (i3) meets a certain requirement, like being
				 * less than a specific number.
				 * 
				 * 3) Execution: Inside the loop, you perform the task you want to repeat. It could
				 * be printing something, calculating a value, or any other action you want to
				 * do.
				 * 
				 * 4) Increment/Update: After each time you do the task, you increment the counter (i3). 
				 * It's like moving the counter (i3) forward by one.
				 * 
				 * Check Condition: At the end of each iteration (completion of the task/step), the
				 * loop checks the condition again. If the condition is still true, it goes back
				 * to step 3 and repeats the task. If the condition is false, the loop stops.
				 */
	      
	            
		    
		    
		    
			   			  // --------------------------- for-each loop -----------------------------------//
			   
System.out.println("------------------------------------ for-each loop -------------------------------------------------");



//also known as the enhanced for loop, does not explicitly have a loop condition in its syntax.
//It is designed to iterate through all elements in an array or collection without the need for a loop condition or an explicit index.





// 			Array --->				 String or IntegarType[] elementVariable = { input collection };

//for-each loop Syntax --->  		for (ElementType  NewVariable: elementVariable) { 
//										     Code to be executed for each element }
		    

			//Example 1: using for-each loop with String
					String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
					
					for (String c : cars) {
								System.out.println(c);
					}
		    
					
			//Example 2: using for-each loop with int
					int[] grades = {80,85,90,95,100};
						
					for (int topGrades: grades) {
							System.out.println(topGrades);
					}
		    
					
			// ------------------------------------------------- Nested Loops ---------------------------------------------//
					
					
					System.out.println("------------------Using nested loops ----> Picked for-each loop as the inner loop --------------------");
					
			//Example 3: Using NESTED loop - [ Outer loop & inner loop }
					
			
					
					 String[] names = {"Alice", "Bob", "Charlie", "David"}; //Array
					    
					    
					    // Loop through the array three times
					 //Outer Loop (for loop):

// 				for (int v = 0; v < 3; v++): The outer loop runs three times (0, 1, 2). The variable v keeps track of the loop iteration.
				        for (int v = 0; v < 3; v++) {	
				        	//		syso. (v+1) because if we just put v alone it will start counting loops from Zero since the value of v=0
				            System.out.println("Loop " + (v+1));
				         
				            
				            //using for-each loop as an inner loop
				            for (String name12 : names) {
				                System.out.println("Hello, " + name12 + "!");}
				        }
				        
				        
				        
				        
				        
				        
				        
				        
				        
				        
				        
				        
				        
				        
				        
		    
						//--------------------------- Break and Continue Control statements in loops ----------------------------------------//
	System.out.println("//--------------------------- Control statements -- {Break and Continue} in loops ----------------------------------------//");
		    
		    
	/*	Syntax for break in loop Below:
	 * 
	 * 			for (initialization; condition; update) {
	 * 
	 * 			 if (condition_to_exit_loop) {
	 * 
	 *		      break;  'Exit loop' 	
	 *				} 
	 *				system.out.printIn or whatever action you need
	 *				'Loop body'		 }
	 */  
		    
	
				
					for (int v = 0; v < 10; v++) {
						  if (v >= 7) {
						    break;
						  }
						  System.out.println("Using break control statement in a loop --->  "+v);
						}
		    
					// setting counter at 30; condition/conditions; iteration/Repetition operator;
					
					// Example 2:
					
					// counter set at 9; if its less than 20; start incrementing by 1 for every loop until reaching the condition limit
					for (int m=9; m<20 ; m++ ) {
						
						// if m is about to be greater than 17 break the loop even if the condition is true and not full processed.
						if(m>17) {
							break;
						}
						System.out.println("Should stop after 17, because break is set at m>17 ---> "+m);
					}
		    
		    
		    
		    
						 // ----------------------------------------------- Array ----------------------------------------//
	System.out.println(" // ----------------------------------------------- Array ----------------------------------------//");
	
	//array index starts at 0. for example: Iphone's index number is 0 in this example.
	String[] phones	 = {"Iphone", "Nokia", "Motorola", "LG", "Unknown","Samsung"};
	
	
	//we can printIn the item without setting an index value, basically just by calling its array index#	
	//printIn [5] should print "Unkown" since its' index is 5
			System.err.println(phones[5]);
	
			// we can also set index numbers in different order.. Examples are below:
		    phones[1]= "Iphone";
		    phones[2]= "Samsung";
		    phones[3]= "LG";
		    System.out.println(phones[1]);
		    System.out.println(phones[2]);
		    System.out.println(phones[3]);
		    
		    System.out.println("Calling by index# (#4 which is the 5th element in the array) without setting values of strings to index --> it should be 'Unknown' --> "+phones[4]);
		    //To measure the number of input/items in the array
		    System.err.println(phones.length);
		    
		    
		    
		    
		    
 // Using array with instance methods to creat objects (used ClientLead instance method, located at the bottom of the page/under the class bracket)  
		  System.out.println("------------------Creating array object using an instance method ------------------------------"); 
		    	    
			/* This is a copy of the instance method located under the class bracket } - outside the class
			 * class ClientLead { 
			 * String fullName; 
			 * int age;
			 *  }
			 */
		  
		  //Call the instance method name,  NewVariable, = new, instanceMethod[2];  [2] is the number of elements that it can hold:
		  	// This array we created below can hold 2 indexes [0,1] 
		   
		 
		  ClientLead[] clientArray = new ClientLead[2];	
		    
		    		    
		    clientArray[0] = new ClientLead();
		    
		    clientArray[0].fullName = "Robert Dunkin";
		    clientArray[0].age = 39;
		    
  
		    clientArray[1] = new ClientLead();
		    clientArray[1].fullName = "Zack Attack";
		    clientArray[1].age= 32;
		   
		    //We can print info this way:  
		    System.out.println(clientArray[0].fullName +" is "+clientArray[0].age +" old");
		    System.out.println(clientArray[1].fullName +" is "+clientArray[1].age +" old");
		    
		  

 // clientArray[2] = new ClientLead(); // if we try to add more elements it will result in an ArrayIndexOutOfBoundsException
			    //because those indexes are beyond the valid range for an array of size 2. Index starts at 0 
		    
		    
		    //------------------------------------------ArrayList----------------------------------------// 
		    
		    
		    System.out.println("------------------------Creating ArrayList----------------------------");
		    
		// ArrayList can be used for storing data, objects, collecting information and it can assist in menu designs.
		 // ArrayList is more flexible than array since the size is changeable and can expand or edited. 
		    ArrayList<String> Vehicles = new ArrayList<String>();
		    
// Adding value with int index.. 
//when we call the variable (vehicles) and pick add, two options pop-up-->    add.(String e): boolean     or    add.(int Integar, String element) :void
		    //Pick --> add.(int Integar, String element) :void --> So we can set index and declare value to the String
		    
		    Vehicles.add(0, "AUDI");
		    Vehicles.add(1, "BMW");
		    Vehicles.add(2, "MERCEDES");
		    Vehicles.add(3, "MOPAR");
		    Vehicles.add(4, "CHEVY");
		    // We can printIn the String value by calling the index #
		    System.out.println("Printing Vehicle names by calling their index number in the ArrayList we created --> "+Vehicles.get(0));
		    System.out.println("Printing Vehicle names by calling their index number in the ArrayList we created --> "+Vehicles.get(1));
		    System.out.println("Printing Vehicle names by calling their index number in the ArrayList we created --> "+Vehicles.get(2));
		    System.out.println("Printing Vehicle names by calling their index number in the ArrayList we created --> "+Vehicles.get(3));
		    
		    //Removing and element from the list by removing the index #
		    Vehicles.remove(4);
		    //if we try to print it, it will say index is out of bound since it's been removed 
		    // System.err.println(Vehicles.get(4));
		    
		    
		    String[] carSize = {"Economy", "Compact", "Standard", "Fullsize","Mid-SUV", "Full-SUV", "Van"};
		    	
		    for (int cS = 0; cS < 2; cS++) {
		      System.out.println("Loop through an array -------->>>>>    "+carSize[cS]);
		    }	

		    
		   
	        
	        
	        
	        
	        
	        
	        
}// Main method bracket





}//Class bracket

//Instance Method must be created outside the public class and outside the main method! We Created two and placed both outside the class brackets
class  ClientLead{
	String fullName;
	int age;
	
}




