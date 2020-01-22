//calculator 

import java.util.Scanner;
public class calcu {
	private static Scanner scanner;

	public static void main(String[] args) {
	double n1 = 0;double n2 = 0; double sum = 0; double minus=0;double multi = 0; double divi =0;
	System.out.println("Scritp with aritmetic operation");
	
	System.out.println("Introduce your first number");
	scanner = new Scanner(System.in);
	n1 = scanner.nextInt();
	
	System.out.println("Introduce your second number");
	n2= scanner.nextInt();
	
	 // Show operations. 
    sum = n1+n2;
    minus = n1-n2;
    multi = n1*n2;
    divi= n1/n2;
	
    // Show the results of the comparison. 
    
	System.out.println("The sum of " + n1 + " plus " + n2 + " makes " + sum);
	
	System.out.println( + n1 + " minus " + n2 + " makes " + minus);
	
	System.out.println( + n1 + " times " + n2 + " is " + multi);
	
	if(n2==0) {
		System.out.println("you cannot use the number 0 in the divisor" );}
	else{
		System.out.println( "divide "+ n1 + "  in " + n2 + " make" + divi);	
     	}
	
	
	
	}
}
