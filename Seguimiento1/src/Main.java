import Enums.CTier;
import Enums.PC;
import Models.Customer;
import Models.Order;
import Models.Product;
import Repository.OrderRepo;
import Repository.ProductRepo;
import Repository.ProductRepoImpl;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Initializer.getproducts();
        while (true) {
            System.out.println("Menú");
            System.out.println("1. Lista de productod de la categoría libros con precios mayorres de 100 ");
            System.out.println("2. Lista de pedidos de la categoría Bebé");
            System.out.println("3. Lista de productos de la categoría Juguetes con 10% de descuento");
            System.out.println("4. Lista de productos pedidos por el cliente del nivel 2 entre el 01 de febrero de 2021 y el 01 de abril de 2021");
            System.out.println("Ingrese el número de la consulta que desea: ");

            int option = Integer.parseInt(System.console().readLine());
            switch (option) {
                case 1:
                    getProductsBooks(products);
                    break;
                case 2:
                    getProductsBaby(products);
                    break;
                case 3:
                    getProductsToys(products);
                    break;

            }
        }
    }
    private static List<Product> getProductsBooks(List<Product> products) {
        String category ="libros";
        List<Product> filteredProducts =  products.stream()
                .filter(e->e.getCategory().equals(PC.fromValue(category)))
                .filter(e->e.getPrice()>100)
                .toList();
        for (Product product : filteredProducts) {
            System.out.println(product);
        }

        return filteredProducts;

    }

    private static List<Product> getProductsBaby(List<Product> products) {
        String category = "Bebé";

        List<Product> filteredProducts = products.stream()
                .filter(e -> e.getCategory().equals(PC.fromValue(category)))
                .toList();

        for (Product product : filteredProducts) {
            System.out.println(product);
        }

        return filteredProducts;
    }
    private static List<Product> getProductsToys(List<Product> products){
        String category = "Juguetes";
        List<Product> filteredProducts = products.stream()
                .filter(e->e.getCategory().equals(PC.fromValue(category)))
                .map(e -> new Product(e.getId(), e.getName(), e.getCategory(), applyDiscount(e.getPrice())))
                .collect(Collectors.toList());

        for (Product product : filteredProducts) {
            System.out.println(product);
        }

        return filteredProducts;

    }

    private static double applyDiscount(double price){
        double discount = 0.1;
        return price - (price * discount);
    }
    private static List<Product> getListCustomers(List<Product> products) {
            List<Product> result = OrderRepo.findAll()
                .stream()
                .filter(e -> e.getCustomer().get()== 2)
                .filter(e -> e.getOrderdate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
                .filter(e -> e.getOrderdate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
                .flatMap(e -> e.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());
        return result;
    }
    private static List<Product> getCheapestBook(List<Product> products){
        String category = "Libros";
        List<Product> filteredProducts = products.stream()
                .filter(e->e.getCategory().equals(PC.fromValue(category)))
                .min(Comparator.comparingDouble(Product::getPrice))
                .stream().toList();

        for (Product product : filteredProducts) {
            System.out.println(product);
        }
        return  filteredProducts;
    }

}

