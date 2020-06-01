package connor.mccurrie.factory;

import connor.mccurrie.singleton.CheckIn;
import connor.mccurrie.strategy.SpecialEventTicket;
import connor.mccurrie.strategy.Ticket;

public class TicketFactory implements Tickets {
    @Override
    public Tickets make(int ticketType) {
        return null;
    }

}

