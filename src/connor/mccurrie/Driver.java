package connor.mccurrie;

import connor.mccurrie.factory.TicketFactory;
import connor.mccurrie.factory.TicketID;
import connor.mccurrie.factory.Tickets;
import connor.mccurrie.singleton.CheckIn;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
    Scanner keyboard = new Scanner(System.in);
    Tickets tickTrack = new TicketID();
    public static void main(String[] args) {

        UserInterface UI = new UserInterface();
        char selection;
        boolean choices = true;

        while (choices) {
            UI.displayEnterMenu();
            selection = UI.getMenu();
            switch (selection) {
                case '1': UI.checkIn(); break;
                case '2': UI.specialEventTicket(); break;
                case '3': UI.checkOut(); break;
                case '4': UI.exitProgram();break;
            }
        }
   }

    public void WriteFile() throws IOException {
        keyboard = new Scanner(System.in);
        FileWriter ticketDeck = new FileWriter("ticketdeck.txt");
        //add in ticket id + time spent in garage
        ticketDeck.write(String.valueOf(TicketID.setTicketID()) + ", " + TicketID.getTime());
        ticketDeck.close();

    }
}
