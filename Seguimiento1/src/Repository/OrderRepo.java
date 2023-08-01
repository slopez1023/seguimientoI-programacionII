package Repository;

import Models.Order;

import java.util.List;

import static Models.Order.orders;

public interface OrderRepo {
    static List<Order> findAll() {
        return orders;
    }
}
