import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Reservation {

    private ArrayList<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }
    public void searchByDestination(String destination) {
        boolean found = false;
        for (Flight f : flights) {
            if (f.getDestination().equalsIgnoreCase(destination)) {
                System.out.println(f);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No flights found");
        }
    }
    public void sortBySeats() {
        flights.sort(Comparator.comparingInt(Flight::getSeats));
    }
    public void showAllFlights() {
        for (Flight f : flights) {
            System.out.println(f);
        }
    }
    public void userSearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter destination: ");
        String dest = scanner.nextLine();
        searchByDestination(dest);
    }
}
