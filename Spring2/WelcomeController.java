package ua.kiev.prog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	private int visitorCount = 0;
	private OrdersDAO ordersDao = new MemOrdersDAO();

	@RequestMapping("/index.html")
	public String index(Model model) {
		model.addAttribute("visitorCount", visitorCount++);
		return "index.jsp";
	}

	@RequestMapping("/list")
	public ModelAndView listUsers() {
		return new ModelAndView("orders.jsp", "orders", ordersDao.getOrders());
	}
}
