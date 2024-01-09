package Product;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceImp implements Service{
    private static Connection conn;
        static {
            String url = "jdbc:mysql://localhost:3306/test";
            String  username = "root";
            String password = "tiger";
            try {
                conn = DriverManager.getConnection(url , username , password);
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        @Override
        public List<Product> displayAllProduct() {
            String displayQuery = "SELECT * FROM PRODUCT_INFO";
            List<Product> productList = new ArrayList<>();
            try {
                Statement stmt = conn.createStatement() ;
                ResultSet rs = stmt.executeQuery(displayQuery);

                while (rs.next())
                {
                    Product product = new Product();
                    product.setProductId();
                    product.setProductName();
                    product.setProductPrice();
                    product.setProductQnty();

                    productList.add(product);
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return productList;
        }
        @Override
        public boolean renameProduct(Product ) {
            String renameQuery="rename from table Product_info where Pid=?";
            List<Product> productList=new ArrayList<>();

            try {
                Statement stmt=conn.createStatement();
               ResultSet rs = stmt.executeQuery(renameQuery);
               while (rs.next()){
                   Product product=new Product();
                   product.setProductId();
                   product.setProductName();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
               @Override

               public List<OrderInfo> displayAllOrder() {
            List<OrderInfo> orderList =new ArrayList<>();
            String displayQuery="select\n" +
                    "o.order_id,\n" +
                    "o.customer_name,\n" +
                    "o.product_qty * product_price as Total,\n" +
                    "p.product_name,\n" +
                    "o.product_qty\n" +
                    "from \n" +
                    "order_info o\n" +
                    "inner join\n" +
                    "product_info p ON o.product_id=p.product_id;";

            try {
                Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(displayQuery);
                while (rs.next())
                {
                    int oId=rs.getInt(1);
                    String cName=rs.getString(2);
                    double totalAmount=rs.getDouble(3);
                    String pName=rs.getString(4);
                    int pQty=rs.getInt(5);
                    OrderInfo o1=new OrderInfo(oId,cName,totalAmount,pName,pQty);
                    orderList.add(o1);

                }
            } catch (SQLException e) {
                System.out.println(e);
            }
            return orderList;
        }
    }




}
