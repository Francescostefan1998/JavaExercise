package package2;

public class Days {

    public String[] weekDays = initializeWeek();


    public static String[] initializeWeek() {
        String[] weekDays = new String[7];

        weekDays[0] = "Monday";
        weekDays[1] = "Tuesday";
        weekDays[2] = "Wednesday";
        weekDays[3] = "Thursday";
        weekDays[4] = "Friday";
        weekDays[5] = "Saturday";
        weekDays[6] = "Sunday";
        return weekDays;
    }
}
