package MVC.service;

import MVC.model.Product;
import MVC.repository.ProductRepository;

import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner sc = new Scanner(System.in);
    ProductRepository productRepository = new ProductRepository();

    @Override
    public void displayProduct() {
        for (int i = 0; i < productRepository.getProductList().size(); i++) {
            System.out.println(productRepository.getProductList().get(i));
        }
    }

    @Override
    public void addNewProduct() {
        // nhap thông tin của sản phẩm
//Product(int id, String name, double price)
        System.out.println("Nhap ID sản phẩm: ");
        int productID = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap Tên Sản Phẩm: ");
        String productName = sc.nextLine();
        System.out.println("Nhap Giá Sản Phẩm: ");
        double productPrice = Double.parseDouble(sc.nextLine());
        Product newProduct = new Product(productID, productName, productPrice);
        productRepository.addNewProduct(newProduct);
        System.out.println("Da them moi san pham" + newProduct.getName());
    }

    @Override
    public void deleteProduct() {
        this.displayProduct();
        System.out.println("Chọn ID cần xóa");
        int idProductDelete = Integer.parseInt(sc.nextLine());
        boolean isDelete = productRepository.deleteProductByID(idProductDelete);
        if (isDelete) {
            System.out.println("ban da xoa thanh cong");

        } else {
            System.out.println("khong tim thay id can xoa");
        }

    }

    @Override
    public void findProduct() {
        System.out.println("Nhap ten san pham can tim");
        String nameProduct = sc.nextLine();
        boolean findName = productRepository.findProductByName(nameProduct);
    }
}
