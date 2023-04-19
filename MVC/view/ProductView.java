package MVC.view;

import MVC.controller.ProductController;

public class ProductView {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.showMenuList();
    }
}
