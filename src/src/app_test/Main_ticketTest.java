package app_test;

import decorators.ticketDecorators.*;
import interfaces.Ticket;
import models.EconomyTicket;

public class Main_ticketTest {
    public static void main(String[] args) {
        Ticket ticket = new EconomyTicket();
        System.out.println("Ticket Description: " + ticket.getDescription());
        System.out.println("Ticket Price: $" + ticket.getPrice());
        System.out.println(" ");

        ticket = new ExtraLegRoom(ticket);
        System.out.println("Ticket Description: " + ticket.getDescription());
        System.out.println("Ticket Price: $" + ticket.getPrice());
        System.out.println(" ");

        ticket = new EmergencyExit(ticket);
        System.out.println("Ticket Description: " + ticket.getDescription());
        System.out.println("Ticket Price: $" + ticket.getPrice());
        System.out.println(" ");

        ticket = new TheOzuExperience(ticket);
        System.out.println("Ticket Description: " + ticket.getDescription());
        System.out.println("Ticket Price: $" + ticket.getPrice());
        System.out.println(" ");
    }
}
