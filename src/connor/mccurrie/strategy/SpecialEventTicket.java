package connor.mccurrie.strategy;

public class SpecialEventTicket implements Ticket {
    private int specialEventTicket;

    public SpecialEventTicket(int specialEventTicket) {
        this.specialEventTicket = specialEventTicket;
    }

    public int getSpecialEventTicket() {
        return specialEventTicket = 20;
    }

    @Override
    public int ticketPrice(int price) {
        return price = specialEventTicket;
    }

    @Override
    public String toString() {return "$" + specialEventTicket;}
}