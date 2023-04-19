package MVC.repository;

import MVC.model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> getProductList ();
    void addNewProduct(Product product);
    boolean deleteProductByID(int id);
    boolean findProductByName(String name);
}
