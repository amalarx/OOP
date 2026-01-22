import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightDAO {

    public void saveFlight(Flight flight) {
        String sql = "INSERT INTO public.flight (flight_number, destination, seats) VALUES (?, ?, ?)";

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, flight.getFlightNumber());
            ps.setString(2, flight.getDestination());
            ps.setInt(3, flight.getSeats());

            ps.executeUpdate();
            System.out.println("Flight saved to DB");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Flight> getAllFlights() {
        List<Flight> flights = new ArrayList<>();
        String sql = "SELECT * FROM public.flight";

        try (Connection conn = DBconnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Flight flight = new Flight(
                        rs.getString("flight_number"),
                        rs.getString("destination"),
                        rs.getInt("seats")
                );
                flights.add(flight);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flights;
    }

    public void updateFlight(String flightNumber, String newDestination, int newSeats) {
        String sql = "UPDATE public.flight SET destination = ?, seats = ? WHERE flight_number = ?";

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, newDestination);
            ps.setInt(2, newSeats);
            ps.setString(3, flightNumber);

            ps.executeUpdate();
            System.out.println("Flight updated");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteFlight(String flightNumber) {
        String sql = "DELETE FROM public.flight WHERE flight_number = ?";

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, flightNumber);
            ps.executeUpdate();
            System.out.println("Flight deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
