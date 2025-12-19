enum Day {
    SUNDAY(0, "sun"),
    MONDAY(1, "mon");

    private int id;
    private String shortName;

    Day(int id, String shortName) {
        this.id = id;
        this.shortName = shortName;
    }

    public int getId() { return id; }
    public String getShortName() { return shortName; }
}

public class Enuermation {
    public static void main(String[] args) {
        Day d = Day.SUNDAY;
        System.out.println(d.getId());
    }
    
}
