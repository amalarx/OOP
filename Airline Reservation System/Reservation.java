public class Reservation {

    private Passenger passenger;
    private Flight flight;

    public Reservation(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
    }

    public void getInfo() {
        System.out.println("Reservation info:");
        passenger.getInfo();
        flight.getInfo();
    }
}