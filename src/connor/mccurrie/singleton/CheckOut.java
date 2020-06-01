package connor.mccurrie.singleton;

import connor.mccurrie.factory.TicketFactory;

import java.util.Scanner;

/**
 * This class represents the output for the ticketing machine
 * @class showMessage() returns the output for checkout
 *
 *
 */

public class CheckOut {
    Scanner keyboard = new Scanner(System.in);
    TicketFactory ticketFactory;
    private static CheckOut instance = new CheckOut();

    private CheckOut(){}

    public static CheckOut getSecondInstance(){
        return instance;
    }

    public void showMessage(){

    }
}
