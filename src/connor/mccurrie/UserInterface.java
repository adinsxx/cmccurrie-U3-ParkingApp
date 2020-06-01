package connor.mccurrie;


import com.intellij.sisyphus.api.User;
import connor.mccurrie.factory.TicketID;
import connor.mccurrie.factory.Tickets;
import connor.mccurrie.factory.Time;
import connor.mccurrie.strategy.LostTicket;
import connor.mccurrie.strategy.RegularTicket;
import connor.mccurrie.strategy.SpecialEventTicket;
import connor.mccurrie.strategy.Ticket;
import org.ini4j.Reg;

import java.util.Scanner;

public class UserInterface {
    private static Scanner keyboard = null;
    private char selection;
    private static UserInterface instance = null;
    Tickets tickets1 = new TicketID();
    Tickets tickets2 = new Time();
    Ticket regularTicketPrice = new RegularTicket();
    Ticket lostTicketPrice = new LostTicket(25);
    Ticket specialEventPrice = new SpecialEventTicket(20);

    public UserInterface() {
        keyboard = new Scanner(System.in);
    }


    public void displayParkingGarageTitle() {
        System.out.println("Best Value Parking Garage\n =====================");
    }

    public void displayEnterMenu() {
        displayParkingGarageTitle();
        System.out.println("1 - Check/In");
        System.out.println("2 - Special Event");
        System.out.println("3 - Check/Out");
        System.out.println("4 - Close Garage");

    }

    public void specialEventTicket() {
        displayParkingGarageTitle();
        System.out.println("Receipt for vehicle ID: " + TicketID.getTicketID());
        System.out.println("Special Event");
        System.out.println(specialEventPrice);
    }


    public void exitProgram() {
        displayParkingGarageTitle();
        System.out.println("Activity to Date");
        System.out.println(" was collected from " + " Check ins");
        System.out.println(" was collected from " + " Lost Tickets");
        System.out.println(" was collected from " + "Special events");
        System.out.println(" was collected overall");
        System.out.println();
    }

    public void regularTicket() {
        displayParkingGarageTitle();
        System.out.println("Receipt for a vehicle ID " + TicketID.getTicketID());
        //add in range of hours parked + total hours parked
        System.out.println(Time.getTimeOut() + Time.getTimeIn() + " hours parked ");
        //Display total cost of ticket
        System.out.println(regularTicketPrice);
        System.out.println();

    }

    public void lostTicket() {
        displayParkingGarageTitle();
        System.out.println("Receipt for vehicle ID: ");
        System.out.println("Lost Ticket");
        System.out.println("$" + lostTicketPrice);
    }

    public void displayExitingMenu() {
        displayParkingGarageTitle();
        System.out.println("1 - Check/Out");
        System.out.println("2 - Lost Ticket");
        String selection = keyboard.nextLine();

        System.out.println();
        System.out.println();


    }

    public void checkIn() {
        System.out.println("Ticket ID: " + TicketID.setTicketID());
        System.out.println("Time in: " + TicketID.getTime());
        System.out.println();
    }

    public static UserInterface getUserInterface() {
        if (instance == null) {
            instance = new UserInterface();
        }
        return instance;
    }

    public char getMenu() {
        System.out.println("Please Enter Choice: ");
        String temp = keyboard.nextLine();
        return temp.charAt(0);
    }

    public void checkOut() {

        displayExitingMenu();
        selection = getMenu();
        switch (selection) {
            case '1':
                regularTicket(); break;
            case '2':
                lostTicket();
        }
    }
}

