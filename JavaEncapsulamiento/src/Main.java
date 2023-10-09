import Person.User;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        switch (option) {
            case 1:
                Scanner getInfo = new Scanner(System.in);
                System.out.println("Ingresa tu rol: ");
                String userRol = getInfo.next();
                System.out.println("Ingresa tu nombre: ");
                String userName = getInfo.next();
                System.out.println("Ingresa tu Apellido: ");
                String userLastName = getInfo.next();
                System.out.println("Ingresa tu contrasena: ");
                String userPasword = getInfo.next();
                System.out.println(userName);
                User UsuarioNumero = new User(userRol,userName,userLastName,userPasword);
                break;
            case 2:
                System.out.println("Seleccionaste la opción 2");
                break;
            default:
                System.out.println("Opción no válida");
        }





        System.out.println(UsuarioNumero.getPassword());




    }
}