package dataTypes;

import java.util.Arrays;

public class DatosStructurados {
	
	
	public static void main(String[] args) {
		
		
		//Son datos complejos que almacenan caracteres o bien algun tipo de datos primitivo
		
		String myString = "Soy una string"; 
		
		//puedes inicializar un objeto string como un objeto tracicional
		
		String myStringObjet = new String("hola soy una string por objeto");
		
		System.out.println("my strings");
		
		
		//ejemplo con metodos y concatenaciones 
		
		
		String texto = "ejemplo de string y metodos";
		
		System.out.println("La longitud de mi variable texto" +  texto.length());
		
		//guardar longitud en una variable 
		
		
		int longitud  = texto.length();
		
		// to lowercase
		
		String miTextoMayusculas = "SOYUNTEXTOENMAYUSCULAS";
		
		String miStringMinusculas = miTextoMayusculas.toLowerCase();
		
		//to upper
		String returnToUpperCase = miStringMinusculas.toUpperCase();
		
		//index
		
		String indexDePalabra = "soy una frase de texto prueba";
		
		int indexmiFrase = indexDePalabra.indexOf("frase");
		
		System.out.println(indexmiFrase);
		
		//concat
		
		
		String primeraPalabra = "My nombre es";
		
		String segundaVariable =  "Iker Toscano";
		
		String finalPalabra = primeraPalabra.concat(segundaVariable);
		
		//obtener un tipo de dato 
		
		
		String numeroString = "5000";
		
		numeroString.getClass().getSimpleName();
		
		int numeroInt = Integer.parseInt(numeroString);
		
		//obtener el tipo de dato de un entero
		
		((Object)numeroInt).getClass().getSimpleName();
		
		// array
		
		String[] cars = {"volkwagen","Ferrari","Chevrolet"};
		
		
		//imprimir el array 
		
		String arrayString = Arrays.toString(cars);
		
		System.out.println(arrayString);
		
		
		for( int i = 0; i < cars.length ; i ++){
			
			
			System.out.println(cars[i]);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
