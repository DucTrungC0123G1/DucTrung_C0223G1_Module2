package ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.service;

import ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.common.WriteReadProduct;
import ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.model.Product;
import ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.repository.ProductManagerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagerService implements IProductManagerService {
    public static String PATH = "ss17_io_biraryfile_serialization/bai_tap/quan_li_san_pham/common/Product.csv";
    Scanner sc = new Scanner(System.in);
    private static ProductManagerRepository productRepository = new ProductManagerRepository();
//    static List<Product> productList = productRepository.getProductList();


    @Override
    public void displayProductList() {
        List<Product> productList = productRepository.getProductList();
        for (Product s : productList) {
            System.out.println(s);
        }


    }

    @Override
    public void searchProduct() {
        System.out.println("Enter NameProduct");
        String nameProduct = sc.nextLine();
        List<Product> productList = productRepository.getProductList();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(nameProduct)) {
                System.out.println("Had Found Position" + (i + 1));
            }

        }

    }

    //public ProductManager(int id, String name, double price, String manufacturer, String description)
    @Override
    public void addProduct() {
        System.out.println("Enter ID");
        int idProduct = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Name");
        String nameProduct = sc.nextLine();
        System.out.println("Enter Price");
        double priceProduct = Double.parseDouble(sc.nextLine());
        System.out.println("Enter Manufacturer");
        String manufacturerProduct = sc.nextLine();
        System.out.println("Enter Description");
        String descriptionProduct = sc.nextLine();
        Product newProduct = new Product(idProduct, nameProduct, priceProduct, manufacturerProduct, descriptionProduct);

        productRepository.addNewProduct(newProduct);
        System.out.println("ADD Product Success" + newProduct.getName());
    }
}
