package MVC.controller;

import MVC.service.ProductService;

import java.util.Scanner;

//Thêm sản phẩm
//        Sửa thông tin sản phẩm theo id
//        Xoá sản phẩm theo id
//        Hiển thị danh sách sản phẩm
//        Tìm kiếm sản phẩm theo tên
//        Sắp xếp sản phẩm tăng dần, giảm dần theo giá
public class ProductController {
    public void showMenuList() {
        ProductService productService = new ProductService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn chọn chức năng");

        boolean flag = true;
        do {
            System.out.println(" Quản Lý Sản Phẩm\n" +
                    "1. Thêm Sản Phẩm\n" +
                    "2. Chỉnh sửa thông tin sản phẩm theo ID\n" +
                    "3. Xóa Sản Phẩm theo ID\n" +
                    "4. Hiện Danh Sách Sản Phẩm\n" +
                    "5. Tìm Kiếm Sản Phẩm Theo Tên\n" +
                    "6. Sắp xếp sản Phẩm tăng dần, giảm dần.\n" +
                    "7. Thoát\n");
            int chose = sc.nextInt();
            switch (chose) {
                case 1:
                    productService.addNewProduct();
                    break;
                case 2: // chỉnh sửa
                    break;
                case 3: // xóa sp
                    productService.deleteProduct();
                    break;
                case 4:
                    productService.displayProduct();
                    break;
                case 5: // tìm kiếm
                    break;
                case 6:// sắp xếp
                    break;
                case 7:
                    flag = false;
                    System.out.println("Bạn đã thoát chương trình");
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
                    break;
            }

        } while (flag);
    }
}
