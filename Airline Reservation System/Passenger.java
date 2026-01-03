public class Passenger extends Person{

    private String passportNumber;
    private String email;
 public Passenger(String name, String passportNumber, String email){
     super(name);
     this.passportNumber=passportNumber;
     this.email=email;
 }
    @Override
    public void showRole() {
        System.out.println("I am a passenger");
    }
    public String getName(){return name;
 }
    public String getPassportNumber() {
        return passportNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;}
    public void getInfo() {
        System.out.println("Passenger: " + name +
                ", Passport: " + passportNumber +
                ", Email: " + email);
    }
}

