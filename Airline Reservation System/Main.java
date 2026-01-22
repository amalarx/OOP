import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter passport number: ");
        String passport = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        Person passenger = new Passenger(name, passport, email);
        passenger.showRole();

        Reservation reservation = new Reservation();

        System.out.print("Enter flight number: ");
        String flightNumber = sc.nextLine();

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter seats: ");
        int seats = sc.nextInt();
        sc.nextLine();

        Flight flight1 = new Flight(flightNumber, destination, seats);
        Flight flight2 = new Flight("TEST123", "Paris", 50);

        FlightDAO flightDAO = new FlightDAO();
        flightDAO.saveFlight(flight1);

        System.out.println("\nFlights from DB:");
        for (Flight f : flightDAO.getAllFlights()) {
            System.out.println(f);
        }

        reservation.addFlight(flight1);
        reservation.addFlight(flight2);

        reservation.userSearch();

        System.out.println("\nFlights sorted by seats:");
        reservation.sortBySeats();
        reservation.showAllFlights();
    }
}
