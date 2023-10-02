package ejemplosloops;

import java.util.Scanner;

public class WhileLoop{
	
	
	public static void main(String[] args) {
		
		
		
		int cuenta = 0;
		
		while(cuenta < 10) {
			
			
			System.out.println(cuenta);
			
			
			cuenta ++;
		}
		
		
		
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		
		
		System.out.println("Ingresa el numero hasta donde quieras tu contador: ");
		
		
		int userNumber = input.nextInt();
		
		
		while( counter <= userNumber) {
			
			
			System.out.println("Cuebta: " +  counter);
			
			counter ++;
			
			
		}
		
		
		input.close();
		
		
		
		
	}
	
	
	
}