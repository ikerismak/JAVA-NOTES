package Collections;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class Hash {

    public static void main(String[] args) {


        HashSet<String> nombres = new HashSet<>();

        for (int i = 0; i < 10 ; i++) {

            nombres.add("nombre" + i);
            
        }


        for( String nombre : nombres){

            System.out.println(nombre);
        }



        System.out.println(nombres.contains("nombre2"));



        //Methods

        nombres.remove("nombre1");
        System.out.println(nombres.size());
        System.out.println(nombres.hashCode());

    }
}
