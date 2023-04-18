package ss12_java_collection_framework.bai_tap.arraylist_linkedlist.repository;

import ss12_java_collection_framework.bai_tap.arraylist_linkedlist.model.Product;

public interface ProductIRepository {
    void addProduct(Product product);
    boolean deleteProductById(String id);
    boolean editProduct(String id);
    void displayProduct();
    boolean findProduct(String name);
}
