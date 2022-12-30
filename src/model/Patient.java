package model;


/**
 *
 * @author giova
 */
public class Patient extends User {

    //Atributos    //Encapsulamiento y modificadores de acceso
    
    private String birthday;
    private double weight;
    private double height;
    private String blood;

   public Patient(String name, String email) {
        super(name,email);
        //Mas instrucciones
    }

    public void setWeight(double weight) {  //Setter - Establecer valor al atributo
        this.weight = weight;
    }

    public String getWeight() { //Getter - Mostrar los atributos

        return this.weight + " Kg.";
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge " + birthday + "\nWeight: " + getWeight() + "\nHeight: " + getHeight() + "\nBlood: " + blood;
    }

}