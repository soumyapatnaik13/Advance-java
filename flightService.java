import java.util.List;

public interface flightService {
    List<FlightData> getFlights(String source,String destination,String date);
}
