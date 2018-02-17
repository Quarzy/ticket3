package restful.ticket3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import restful.ticket3.service.tickets.TicketForm;
import restful.ticket3.service.tickets.TicketService;

@Controller
public class TicketsController {

	@Autowired
	private TicketService _ticketService;

	@GetMapping("/tickets/new")
	public String newTicket(Model model) {
		model.addAttribute("form", new TicketForm());
		return "tickets/edit";
	}

	@PostMapping("/tickets")
	public String post(TicketForm form, BindingResult errors) {
		if (errors.hasErrors()) {
			return "tickets/";
		}
		int ticketId = _ticketService.append(form);
		return "redirect: /tickets/" + ticketId;
	}
}
