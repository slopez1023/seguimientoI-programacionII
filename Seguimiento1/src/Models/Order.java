package Models;

import Models.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Long id;
    private String status;
    private LocalDate orderdate;
    private LocalDate deliverydate;
    private List<Product> products;
    private List<Customer> customer;
    public Long getId() {
        return id;
    }

    public Order(Long id,String status, LocalDate orderdate, LocalDate deliverydate, List<Product> products, List<Customer> customer) {
        this.id = id;
        this.status = status;
        this.orderdate = orderdate;
        this.deliverydate = deliverydate;
        this.products = products;
        this.customer = customer;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(LocalDate orderdate) {
        this.orderdate = orderdate;
    }

    public LocalDate getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(LocalDate deliverydate) {
        this.deliverydate = deliverydate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

    public static List<Order> getOrders() {
        return orders;
    }

    public static void setOrders(List<Order> orders) {
        Order.orders = orders;
    }

    public static List<Order> orders = new ArrayList<>();

    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderdate +
                ", deliveryDate=" + deliverydate +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }
}
