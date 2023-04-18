package ss12_java_collection_framework.bai_tap.arraylist_linkedlist.repository;

import ss12_java_collection_framework.bai_tap.arraylist_linkedlist.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements ProductIRepository {
    Scanner sc = new Scanner(System.in);
    public static List<Product> productList = new ArrayList<>();

    static {
        Product product = new Product("001", "coin", 123);
        Product product1 = new Product("002", "coin", 123);
        Product product2 = new Product("003", "coin", 123);
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
    }
    @Override
    public static void addProduct(Product product) {

    }

    @Override
    public static boolean deleteProductById(String id) {
        boolean flag = true;
        for (int i = 0; i < productList.size(); i++) {
            if (id.equals(productList.get(i).getId())) {
                productList.remove(i);
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    @Override
    public static boolean editProduct(String id) {
        boolean flag = true;
        for (int i = 0; i < productList.size(); i++) {
            if (id.equals(productList.get(i).getId())) {
                flag = true;
                System.out.println("nhập ID vào");
                String inputId = sc.nextLine();
                productList.get(i).setId(inputId);
                System.out.println("nhập tên sản phẩm  vào");
                String inputName = sc.nextLine();
                productList.get(i).setName(inputName);
                System.out.println("nhập giá tiền  vào");
                double inputPrice = sc.nextDouble();
                productList.get(i).setPrice(inputPrice);

            } else {
                flag = false;
            }
        }
        return flag;
    }

    @Override
    public static void displayProduct() {
        for (Product e : productList) {
            System.out.println(e);
        }
    }

    @Override
    public static boolean findProduct(String name) {
        boolean flag = true;
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getName())) {
                flag = true;
                System.out.println(productList.get(i));
            } else {
                flag = false;
            }

        }
        return flag;
    }

}
