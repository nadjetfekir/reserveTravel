@Controller
public class UserController {

	@RequestMapping("/loggedout")
	public String showLogout() {
		return "loggedout";
	}

}