
import java.util.ArrayList;
import java.util.List;

public class AkasaService implements flightService {
    @Override
    
        public List<FlightData> getFlights(String source, String destination, String date) {
            List<FlightData> AkasaServices = new ArrayList<>();
            AkasaServices.add(new FlightData("bhubaneswar", "bhopal", "01-03-2024"));
            AkasaServices.add(new FlightData("Mumbai", "Delhi", "01-02-2025"));
            AkasaServices.add(new FlightData("kolkata", "delhi", "03-08-2025"));
        
            // Filtering flights based on user input
            List<FlightData> matchingFlights = new ArrayList<>();
            for (FlightData flight : AkasaServices) {
                if (flight.getSource().equalsIgnoreCase(source) &&
                    flight.getDestination().equalsIgnoreCase(destination) &&
                    flight.getDate().equals(date)) {
                    matchingFlights.add(flight);
                }
            }
            
            return matchingFlights;
        }
        
    }



