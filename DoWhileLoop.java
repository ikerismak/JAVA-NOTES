package ejemplosloops;

import java.util.Scanner;

public class DoWhileLoop{
	
	
	public static void main(String[] args) {
		
		
		
		
		Scanner skner = new Scanner(System.in);
		int opcionSeleccionada;
		
		
		
		
		do {
			opcionSeleccionada = skner.nextInt();
		
			switch(opcionSeleccionada) {
			case 1:
				System.out.println("Consultar saldo");
				break;
			case 2:
				System.out.println("Ingresar dineros");
				break;
			case 3:
				System.out.println("Retirar dineros");
				break;
			case 4: 
				System.out.println("Salir");
				break;
				default:
					System.out.println("Elige una opción válida");
					break;
			}
			
		
		} while (opcionSeleccionada != 4);
		
		
		skner.close();
		
		
		
		
		
		
		
		
		
	}
	
};