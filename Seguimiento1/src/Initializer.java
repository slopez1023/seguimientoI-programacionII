import Enums.CTier;
import Enums.PC;
import Models.Customer;
import Models.Order;
import Models.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Initializer {
    static List<Product> getproducts() {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product(1L, "Book 1", PC.BOOKS, 15.000);
        products.add(product1);
        Product product2 = new Product(2L, "Book 2", PC.BOOKS, 19.000);
        products.add(product2);
        Product product3 = new Product(3L, "Book 3", PC.BOOKS, 25.000);
        products.add(product3);
        return List.of(product1, product2, product3);
    }

    private static List<Customer> getCustomerList() {
        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer(1L, "<NAME>", CTier.TYPE1);
        customers.add(customer1);
        Customer customer2 = new Customer(2L, "<NAME>", CTier.TYPE2);
        customers.add(customer2);
        Customer customer3 = new Customer(3L, "<NAME>", CTier.TYPE3);
        customers.add(customer3);

        return List.of(customer1, customer2, customer3);
    }

    private static Order crateOrder(List Products) {
        Order order = new Order(1L,"Waiting", LocalDate.now(), LocalDate.now().plusDays(7), getproducts(), getCustomerList());
        return order;
    }
}
