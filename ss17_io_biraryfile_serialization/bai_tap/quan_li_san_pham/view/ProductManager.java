package ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.view;

import ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.controller.ProductManagerController;

public class ProductManager {
    public static void main(String[] args) {
        ProductManagerController productManager = new ProductManagerController();
        productManager.showProductMenu();
    }
}
