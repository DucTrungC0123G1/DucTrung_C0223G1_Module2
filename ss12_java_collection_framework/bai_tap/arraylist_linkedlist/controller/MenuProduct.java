package ss12_java_collection_framework.bai_tap.arraylist_linkedlist.controller;

import ss12_java_collection_framework.bai_tap.arraylist_linkedlist.service.ProductService;

import java.util.Scanner;

public class MenuProduct {
    Scanner sc = new Scanner(System.in);
    ProductService productService = new ProductService();

    public void productManager() {
        System.out.println("quản lý sản phẩm");
        boolean flag = true;
        do {
            System.out.println("mời nhập lựa chọn\n" +
                    "1. thêm\n" +
                    "2. sửa \n" +
                    "3. tìm tên\n" +
                    "4. xoá\n" +
                    "5. hiển thị thông tin sản phẩm\n" +
                    "0. exit");
            int input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.editProduct();
                    break;
                case 3:
                    productService.findProduct();
                    break;
                case 4:
                    productService.deleteProduct();
                    break;
                case 5:
                    productService.display();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("không có số trên");
            }
        } while (flag);
    }
}