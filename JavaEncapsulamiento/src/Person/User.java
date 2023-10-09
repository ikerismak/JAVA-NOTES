package Person;

public class User {
    private String rol;
    private String useName;
    private String lastName;
    private String password;

    //create new user

    public User(String rol, String useName, String lastName, String password) {
        this.rol = rol;
        this.useName = useName;
        this.lastName = lastName;
        this.password = password;
    }



    //password recovery

    public String getPassword() {
        return password;
    }


    //change password


    public void setPassword(String password) {

        System.out.println(password);
        System.out.println(this.password);

    }
}
