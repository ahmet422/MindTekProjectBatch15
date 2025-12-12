package conditionsandloops;

public class Weekdays {
    public static void main(String[] args) {
        // ask a user to enter any number in range 1 to 7
        // print corresponding day of the week: 1 -> Monday, 2 -> Tuesday, 7 -> Sunday
        Exercises obj = new Exercises();
        // go to Exercises class and find and execute/run method findNameOfDay()
        // String matchingDay = obj.findNameOfDay();
        //System.out.println(matchingDay);

        String matchingSeason = obj.findNameOfSeason();
        System.out.println(matchingSeason);
    }
}
