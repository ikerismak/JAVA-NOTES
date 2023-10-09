package POO;

public class Paciente {

//    Atributes

    String socialSecurityNumber, bloodType, date;
    boolean expedient, medicalSupport,alergies;

    public Paciente(String socialSecurityNumber, String bloodType, String date, boolean expedient, boolean medicalSupport, boolean alergies) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.bloodType = bloodType;
        this.date = date;
        this.expedient = expedient;
        this.medicalSupport = medicalSupport;
        this.alergies = alergies;
    }


}
