public class Flight {

    private final String flightNumber;
    private final String destination;
    private final int seats;
    public Flight(String flightNumber, String destination, int seats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.seats = seats;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public String getDestination() {
        return destination;
    }
    public int getSeats() {
        return seats;
    }
    public void getInfo() {
        System.out.println("Flight: " + flightNumber +
                ", Destination: " + destination +
                ", Seats: " + seats);
    }
}