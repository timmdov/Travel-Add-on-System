package decorators;
import interfaces.Ticket;
public abstract class TicketDecorator implements Ticket {
    protected Ticket ticket;
    public TicketDecorator(Ticket ticket) {
        this.ticket = ticket;
    }
    @Override
    public String getDescription() {
        return ticket.getDescription();
    }
    @Override
    public double getPrice() {
        return ticket.getPrice();
    }
}