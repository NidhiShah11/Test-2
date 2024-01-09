package Product;

public class Order {
    private int OrderId;
    private String C_Name;
    private int ProductId;
    private int Product_qnty;
    private double Total;

    public Order() {
    }

    public Order(int orderId, String c_Name, int productId, int product_qnty, double total) {
        OrderId = orderId;
        C_Name = c_Name;
        ProductId = productId;
        Product_qnty = product_qnty;
        Total = total;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public String getC_Name() {
        return C_Name;
    }

    public void setC_Name(String c_Name) {
        C_Name = c_Name;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public int getProduct_qnty() {
        return Product_qnty;
    }

    public void setProduct_qnty(int product_qnty) {
        Product_qnty = product_qnty;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }
}
