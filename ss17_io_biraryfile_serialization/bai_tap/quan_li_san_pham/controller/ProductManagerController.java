package ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.controller;

import ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.service.IProductManagerService;
import ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.service.ProductManagerService;

import java.util.Scanner;

public class ProductManagerController {
    private IProductManagerService productService = new ProductManagerService();

    public void showProductMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----PRODUCT MENU----\n" +
                    "1.ADD PRODUCT.\n" +
                    "2.DISPLAY PRODUCT.\n" +
                    "3.SEARCH PRODUCT.\n" +
                    "4.EXIT.\n" +
                    "Press Your Choice");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    productService.addProduct();
                    break;
                    //ADD product
                case "2":
                    productService.displayProductList();
                    break;
                    //Display product
                case "3":
                    productService.searchProduct();
                    break;
                    //Search product
                case "4":
                    flag = false;
                    System.out.println("Exit Menu");
                    break;
                default:
                    System.out.println("choice again");
                    break;
            }

        } while (flag);
    }
}
