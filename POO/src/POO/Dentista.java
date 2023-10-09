package POO;
public class Dentista extends Persona{

    /*
     * ya no creo valores como nombre, edad, apellido, etc., porque estos valores los voy a heredar de la clase Persona
     */

    //1 Atributos
    String especialty;
    String workId;
    String siteWork;
    String experience;
    String shift;
    int salary;



    //2 Constructor
    public Dentista(String name, String lastName, byte age, String phoneNumber, String email, String especialty,String workId, String siteWork, String experience, String shift, int salary) {
        super(name,lastName,age,phoneNumber, email); //informacion de la clase Persona
        //informacion de la clase Dentista
        this.especialty = especialty;
        this.workId = workId;
        this.siteWork = siteWork;
        this.experience = experience;
        this.shift = shift;
        this.salary = salary;

    }//constructor Dentista con informacion heredada


    void Salary(){

        if(experience.equals("basic")){
            salary = 5000;
        }
        if(experience.equals("intermediate")){
            salary = 20000;
        }
        if(experience.equals("advance")){
            salary = 30000;
        }
    }

    void infoDentist(){
        System.out.println("Specialty: " + especialty);
        System.out.println("Salary: " + salary);

    }

}//cierre de Dentista


