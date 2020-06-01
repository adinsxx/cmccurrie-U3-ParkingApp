package connor.mccurrie;

import connor.mccurrie.strategy.Ticket;

import java.util.ArrayList;

public class TicketDB {
    private ArrayList<Ticket> tickets;

    public TicketDB() {
        tickets = new ArrayList<>();
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public void payTicket(Ticket ticket){
        tickets.remove(ticket);
    }


}
