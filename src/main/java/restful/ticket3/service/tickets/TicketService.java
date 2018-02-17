package restful.ticket3.service.tickets;

import org.springframework.stereotype.Service;

@Service
public class TicketService {

	public TicketForm read(int ticketId) {
		return new TicketForm();
	}

	public void replace(TicketForm form) {

	}

	public int append(TicketForm form) {
		return 1;
	}

	public void remove(int id) {

	}
}
