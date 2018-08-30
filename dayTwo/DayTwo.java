package dayTwo;

public class DayTwo {

	
	//void method practice//
	
	public static void printComments(char ltr) {
	//static methods only need the class and name to be called from another class\\ 
		System.out.println("The letter passed in is "+ ltr );
		
		
		
	}
	protected static void printNumberDetails(int x) {
		// protected means that it is only visible in same package//
		if(x > 0) {
		System.out.println("the number is big and positive");
		}
	
		else if(x <0) {
			System.out.println("the number is small and negative");
			
		}else{
			System.out.println("the number is imaginary and/or DNE ");
		}
	}
	public static void Temperature(int temp) {
		if(temp< 60 && temp > 32) {
			System.out.println("What to wear: Jacket");
		}else if(temp < 79 && temp > 60) {
			System.out.println("What to wear: Sweater");
		}else if(temp > 80) {
			System.out.println(" What to wear: Shorts");
		}else if(temp < 32) {
			System.out.println("What to wear: All Your Clothes");
		}
	}
	
	public static void main(String[] args) {
		// Loop Practice
	for(int x =0; x<10; x++) {
	System.out.println("value is: " + x);	
	}
	
	int X = 1;
	while( X == 1) {
		X++;
	}
	X =0;//reset value//
	do{
	System.out.println("Value is at: " + X);
	X++;
	}
	while(X == 1);
	
	for(int a=0; a<10; a++) {
	System.out.print("\n" + a+ "\n");	
	
	for(int i=0; i<10; i++) {
		System.out.print(i + " ");
	}
	char blah = 'f';
	
	
	
	
	Math.max(2, 1);
	printComments(blah);
	printNumberDetails(10);
}

	
	
	
	
	
	
	
	
	
}
}