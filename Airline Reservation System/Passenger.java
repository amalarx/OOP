public class Passenger {
    private String name;
    private String passportNumber;
    private String email;
    public Passenger(String name, String passportNumber, String email) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void getInfo() {
        System.out.println("Passenger: " + name +
                ", Passport: " + passportNumber +
                ", Email: " + email);
    }
}

