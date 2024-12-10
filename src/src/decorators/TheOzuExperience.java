package decorators;
import interfaces.Ticket;
public class TheOzuExperience extends TicketDecorator{
    public TheOzuExperience(Ticket ticket) {
        super(ticket);
    }
    @Override
    public String getDescription() {
        return ticket.getDescription() + ", The Ozu Experience";
    }
    @Override
    public double getPrice() {
        return ticket.getPrice() + 70.0;
    }
}
