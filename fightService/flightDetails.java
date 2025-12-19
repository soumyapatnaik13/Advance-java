package fightService;

import java.sql.Date;

public class flightDetails {
    private static int globalIdCounter = 0;
     final int id;
    String src;
    String des;
    Date date;
    flightNames airline ;
    static int flight_id;
    flightDetails(String src, String des, Date date,flightNames airline){
        this.id = ++globalIdCounter; 
        this.src= src;
        this.des=des;
        this.date=date;
        this.airline = airline;
    }
    
}
