package ua.kiev.prog;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface OrdersDAO {
    List<Order> getOrders();
}
