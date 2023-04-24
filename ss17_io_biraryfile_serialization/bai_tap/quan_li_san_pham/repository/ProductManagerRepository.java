package ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.repository;

import ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.common.WriteReadProduct;
import ss17_io_biraryfile_serialization.bai_tap.quan_li_san_pham.model.Product;

import java.util.ArrayList;
import java.util.List;

//public ProductManager(int id, String name, double price, String manufacturer, String description)
public class ProductManagerRepository implements IProductManagerRepository {
    public static final String PATH = "ss17_io_biraryfile_serialization/bai_tap/quan_li_san_pham/common/Product.csv";
    private static ArrayList<Product> productList = new ArrayList<>();


    static {
    productList.add(new Product(01,"Dell",12000,"Dellcompany","abc"  ));
    productList.add(new Product(02,"Dellxps",14000,"Dellcompany","abc"  ));
    productList.add(new Product(03,"Dellvostrol",15000,"Dellcompany","abc"  ));
    }

    @Override
    public List<Product> getProductList() {
        productList = WriteReadProduct.readFile(PATH);
        return productList;
    }

    @Override
    public void addNewProduct(Product product) {
    productList.add(product);
    WriteReadProduct.writeProduct(PATH,productList,false);

    }

    @Override
    public void searchProduct() {

    }
}
