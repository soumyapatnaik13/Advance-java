// Enum Example in Java
public class Enum {

    // Define an enum to represent days of the week
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Accessing enum values
        Day today = Day.MONDAY;

        // Using enum in a switch statement
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Midweek days.");
        }

        // Iterating over all enum values
        System.out.println("All days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}