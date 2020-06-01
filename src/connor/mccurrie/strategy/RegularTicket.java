package connor.mccurrie.strategy;

import connor.mccurrie.factory.Time;

public class RegularTicket implements Ticket{
    @Override
    public int ticketPrice(int price) {
        Time ticketTime = new Time();
        int timeParked = ticketTime.getTimeIn() - ticketTime.getTimeOut();
        if (timeParked < 3) {
            price = 5;
        } else if (timeParked > 3) {
            price = 5 + (timeParked - 3);
        }
        return price;
    }
}
