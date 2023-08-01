package Repository;

import Models.Product;

import java.util.List;

import static Models.Product.products;

public interface ProductRepo {
    Product findById(int id);

     List<Product> findAll();
}
