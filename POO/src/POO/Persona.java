package POO;

public class Persona {

    // atributes
    //constructor
    //methods
    //instances

    public String name,lasName,phoneNumber,email;
    private byte age;
    char sex ;
    float weigth,height;



    // void function

    void printInfo(){

        System.out.println("El nombre es: " + name + lasName);
        System.out.println("Phone number:" + phoneNumber);
        System.out.println("Email:" + email);

        if(age != 0){
            System.out.println("Age: " + age);
        }
    }

    void greattings(){

        System.out.println("Hola");

    }



    public Persona(String name, String lasName, byte age, String email, String phoneNumber) {
        this.name = name;
        this.lasName = lasName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

}
