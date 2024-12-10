package models;

import interfaces.Ticket;

public class EconomyTicket implements Ticket {

    public String getDescription(){return "Economy Ticket";}

    public double getPrice(){return 100.0;}
}
