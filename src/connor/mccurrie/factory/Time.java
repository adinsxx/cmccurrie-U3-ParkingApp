package connor.mccurrie.factory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Time implements Tickets{
    private static String pattern = "HH";
    private int hours;

    public Time() {
        hours = 0;
    }

    public Time(int hours) {
        this.hours = hours;
    }

    public static int getTimeIn(){
        int randomTime = ThreadLocalRandom.current().nextInt(7, 12);
        String randomHour = Integer.toString(randomTime);
        DateFormat standard = new SimpleDateFormat(pattern);
        return randomTime;
    }

    public static int getTimeOut(){
        int randomTime = ThreadLocalRandom.current().nextInt(1, 11);
        String randomHour = Integer.toString(randomTime);
        DateFormat standard = new SimpleDateFormat(pattern);
        return randomTime;
    }

    @Override
    public Tickets make(int ticketType) {
        return null;
    }
}
