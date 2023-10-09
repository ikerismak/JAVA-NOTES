package Collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    public static void main(String[] args) {


        ArrayList<String> listaDeContactos = new ArrayList<>();


        listaDeContactos.add("Platano");
        listaDeContactos.add("Naranja");
        listaDeContactos.add("Platano");
        listaDeContactos.add("Naranja");


        for (int i = 0; i < 10; i++) {


            listaDeContactos.add("Elemento del mandado :" + i);

        }


        System.out.println(listaDeContactos.get(0));




        for (String elemento: listaDeContactos) {

            System.out.println(elemento);

        }




    }




}