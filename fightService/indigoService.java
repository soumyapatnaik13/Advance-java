package fightService;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class indigoService implements flightServices{
    @Override
    public List<flightDetails> getAllFlights(String src, String dest, Date date) {
        // In reality, you'd query a DB or API. Here we return dummy data.
        List<flightDetails> flights = new ArrayList<>();

        flights.add(new flightDetails(src, dest, date, flightNames.INDIGO));
        flights.add(new flightDetails(src, dest, date,flightNames.INDIGO));
        flights.add(new flightDetails(src, dest, date, flightNames.INDIGO));

        return flights;
    }
    
}
