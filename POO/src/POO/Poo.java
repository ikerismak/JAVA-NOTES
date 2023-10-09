package POO;

import java.util.ArrayList;
import java.util.List;

public class Poo {

    public static void main(String[] args) {


        Persona personaUno = new Persona("Iker", "Toscano",(byte)18,"ikerismak@gmail.com","31212155");


        System.out.println(personaUno.getAge());
        System.out.println(personaUno.name);

        personaUno.printInfo();

        byte number = 0;

        System.out.println(number);




        ArrayList<String> perros = new ArrayList<>();

        perros.add("perroUno");
        perros.add("perroDos");
        perros.add("perroTres");


        for(String elemento: perros){

            System.out.println(elemento);
        }




    }
}
