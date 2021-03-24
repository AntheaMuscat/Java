import java.util.Date;

public class Person {
    private String id;
    private String name;
    private String surname;
    private Date dateOfBirth;
    private String address;
    private boolean isAlive;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public Date getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public Person(String id, String name, String surname, Date dob, String address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dob;
        this.address = address;
        this.isAlive = true;
    }

    public void die() {
        isAlive = false;
    }
}
