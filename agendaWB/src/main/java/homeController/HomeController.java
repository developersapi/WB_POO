package homeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String paginaHome() {
		// modificação do gerson
		return "index";
	}

}
