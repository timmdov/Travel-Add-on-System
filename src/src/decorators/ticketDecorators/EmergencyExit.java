package decorators.ticketDecorators;
import interfaces.Ticket;
public class EmergencyExit extends TicketDecorator {
    public EmergencyExit(Ticket ticket) {
        super(ticket);
    }
    @Override
    public String getDescription() {
        return ticket.getDescription() + ", Emergency Exit";
    }
    @Override
    public double getPrice() {
        return ticket.getPrice() + 40.0;
    }
}
