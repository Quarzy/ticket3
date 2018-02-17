package restful.ticket3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/hogehoge")
	public String get() {
		return "top";
	}
}
