package ua.kiev.prog;

import java.util.*;

public class MemOrdersDAO implements OrdersDAO {

	private List<Order> list = new ArrayList<Order>();
	
	public MemOrdersDAO() {
		list.add(new Order("User1", "Street 1", "IPhone", 899.99));
		list.add(new Order("User2", "Street 2", "IPad", 799.99));
		list.add(new Order("User3", "Street 3", "Samsung S5", 699.99));
	}
	
	public List<Order> getOrders() {
	    return list;
	}
}
