package fightService;

import java.sql.Date;
import java.util.List;

public interface flightServices {
    List<flightDetails> getAllFlights(String src, String dest, Date date);
}
