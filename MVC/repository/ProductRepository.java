package MVC.repository;

import MVC.model.Product;

import java.util.ArrayList;

public class ProductRepository implements IProductRepository {
    public static ArrayList<Product> productsList = new ArrayList<>();

    static {
        Product product1 = new Product(01, "dell1", 123);
        Product product2 = new Product(02, "dell2", 123);
        Product product3 = new Product(03, "dell3", 123);
        Product product4 = new Product(04, "dell4", 123);
        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        productsList.add(product4);
    }

    @Override
    public ArrayList<Product> getProductList() {
        return productsList;
    }

    @Override
    public void addNewProduct(Product product) {
        productsList.add(product);

    }

    @Override
    public boolean deleteProductByID(int id) {
        boolean flag = true;
        for (int i = 0; i < productsList.size(); i++) {
            if (id == productsList.get(i).getId()) {
                productsList.remove(i);
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    @Override
    public boolean findProductByName(String name) {
        return false;
    }


}
