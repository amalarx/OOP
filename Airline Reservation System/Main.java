import java.util.Scanner;

public class Main {
    void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter passport number: ");
        String passport = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        Passenger passenger = new Passenger(name, passport, email);

        System.out.print("Enter flight number: ");
        String flightNumber = sc.nextLine();

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter seats: ");
        int seats = sc.nextInt();

        Flight flight = new Flight(flightNumber, destination, seats);

        Reservation reservation = new Reservation(passenger, flight);

        System.out.println();
        reservation.getInfo();

        Flight anotherFlight = new Flight("TEST123", destination, 50);
        System.out.println();
        System.out.println("Same destination: " +
                flight.getDestination().equals(anotherFlight.getDestination()));
    }
}
