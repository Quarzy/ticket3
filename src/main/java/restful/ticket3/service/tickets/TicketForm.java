package restful.ticket3.service.tickets;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class TicketForm {

	@NotBlank
	@Length(max = 255)
	private String _title;


	public String getTitle() {
		return _title;
	}


	public void setTitle(String title) {
		_title = title;
	}


	@NotBlank
	@Length(max = 255)
	private String _status;


	public String getStatus() {
		return _status;
	}


	public void setStatus(String status) {
		_status = status;
	}


	@Length(max = 1000)
	private String _description;


	public String getDescription() {
		return _description;
	}


	public void setDescription(String description) {
		_description = description;
	}

}
