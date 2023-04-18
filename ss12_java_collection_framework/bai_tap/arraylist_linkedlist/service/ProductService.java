package ss12_java_collection_framework.bai_tap.arraylist_linkedlist.service;

import ss12_java_collection_framework.bai_tap.arraylist_linkedlist.model.Product;
import ss12_java_collection_framework.bai_tap.arraylist_linkedlist.repository.ProductIRepository;
import ss12_java_collection_framework.bai_tap.arraylist_linkedlist.repository.ProductRepository;

import java.util.Scanner;

public class ProductService implements ProductIService {
    ProductRepository repository = new ProductRepository();
    Scanner sc = new Scanner(System.in);


    @Override
    public void addProduct() {
        System.out.println("nhập ID ");
        String inputId = sc.nextLine();
        System.out.println("nhập tên sản phẩm");
        String inputName = sc.nextLine();
        System.out.println("nhập giá tiền ");
        double inputPrice = sc.nextDouble();
        Product product = new Product(inputId,inputName,inputPrice);
        ProductRepository.addProduct(product);
    }

    @Override
    public void editProduct() {
        System.out.println("nhập ID vào để sửa");
        String inputId = sc.nextLine();
        boolean edit = ProductRepository.editProduct(inputId);
        if (edit) {
            System.out.println("đã sửa thành công");
        } else {
            System.out.println("không tìm thấy");
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("nhập ID sản phẩm bạn muốn xoá");
        String inputId = sc.nextLine();
        boolean delete = ProductRepository.deleteProductById(inputId);
        if (delete) {
            System.out.println("đã xoá thaành công");
        }else {
            System.out.println("không tìm thấy");
        }

    }

    @Override
    public void findProduct() {
        System.out.println("nhập tên sản phẩm cần tìm");
        String inputName = sc.nextLine();
        boolean findName = ProductRepository.findProduct(inputName);
        if (findName) {
            System.out.println("đã tìm thấy");
        } else {
            System.out.println("không tìm thấy");
        }
    }

    @Override
    public void display() {
        ProductRepository.displayProduct();
    }
}
