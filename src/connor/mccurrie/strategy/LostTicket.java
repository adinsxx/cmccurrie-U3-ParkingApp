package connor.mccurrie.strategy;

public class LostTicket implements Ticket {
    private int lostTicketCost;

    public LostTicket(int lostTicketCost) {
        this.lostTicketCost = lostTicketCost;
    }

    public int getLostTicketCost() {
        return lostTicketCost = 25;
    }

    @Override
    public int ticketPrice(int price) {
        return price = lostTicketCost;
    }

    @Override
    public String toString() {return "Lost ticket cost: $" + lostTicketCost;}

}
