package ejemplosloops;

public class ForLoop{
	
	
	public static void main(String[] args) {
		
		
		int filas = 5;
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		int potencias = 5;
		
		for(int base = 1; base <= potencias; base++) {
			
			
			double raicedNumber = Math.pow(Math.PI, base);
			
			String resultad = String.format("La potencia de %d es %.4f", base, raicedNumber);
			
			System.out.println(resultad);
		
			
		}
		
	
		
		
		
	}
	
}