package decorators.ticketDecorators;
import interfaces.Ticket;
public class ExtraLegRoom extends TicketDecorator {
    public ExtraLegRoom(Ticket ticket) {
        super(ticket);
    }
    @Override
    public String getDescription() {
        return ticket.getDescription() + ", Extra Legroom";
    }
    @Override
    public double getPrice() {
        return ticket.getPrice() + 30.0;
    }

}
