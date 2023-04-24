package ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.repository;

import ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.model.Product;

import java.util.List;

public interface IProductManagerRepository {
    List<Product> getProductList();
    void addNewProduct(Product product);
    void searchProduct();
}
