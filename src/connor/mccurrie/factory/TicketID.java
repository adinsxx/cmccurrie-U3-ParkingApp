package connor.mccurrie.factory;

public class TicketID implements Tickets {
    private static int ticketID;
    private static Time time = new Time();

    public static int getTicketID() {
        return ticketID;
    }

    public static int setTicketID() {
        ticketID++;
        return ticketID = ticketID;
    }

    public static int getTime() {
        return time.getTimeIn();
    }

    public void setTime(Time time) {
        this.time = time;
    }


    @Override
    public Tickets make(int ticketType) {
        return null;
    }
}
