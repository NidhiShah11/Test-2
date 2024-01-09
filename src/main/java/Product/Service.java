package Product;

import java.util.List;

public interface Service {
    List<Product> displayAllProduct();

    boolean renameProduct();

    OrderInfo[] displayAllOrders();

}
