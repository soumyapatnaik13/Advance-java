//use to add flight data from the user
public class FlightData {
    private String source;
    private String destination;
    private String date;

    public FlightData(String source,String destination,String date){
        this.source = source;
        this.destination=destination;
        this.date= date;
    }
    public String getSource(){
        return source;
    }
    public String getDestination(){
        return destination;
    }
    public String getDate(){
        return date;
    }
    @Override
    public String toString() {
        return "FlightData{" +
                
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
