package Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    static Scanner sc=new Scanner(System.in);
    static ServiceImp service=new ServiceImp();

    public static void main(String[] args) {
        System.out.println("SELECT OPTION");
        System.out.println("1. DISPLAY ALL PRODUCT");
        System.out.println("2. RENAME PRODUCT");
        System.out.println("3. UPDATE PRODUCT");
        System.out.println("4. PLACE ORDER");
        System.out.println("5. DISPLAY ORDER");
        System.out.println("6. EXIT");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                DisplayAllProduct();
                break;
            case 2:
                renameProduct();
                break;
            case 3:
                UpdateProduct();
                break;
            case 4:
                //placeOrder();
                break;
            case 5:
                DisplayOrders();
                break;
            case 6:
                System.out.println("EXIT");
                break;
            default:
                System.err.println("INVALID OPTION !!!!!");
        }
        main(args);
    }
    public static void DisplayAllProduct(){
        List<Product> productList=new ArrayList<Product>();
        System.out.println("**********************************");
        for (Product p:productList)
            System.out.println(p.getProductId() +"    "+p.getProductName() +"    "+  p.getProductPrice());
        System.out.println("*****************************************");
    }
    public static void renameProduct(){
        List<Product> productList=new ArrayList<Product>();
        System.out.println("***************");
        for (Product p: productList)
            System.out.println(p.getProductName());

    }
    public static void UpdateProduct(){
        List<Product> productList=new ArrayList<>();
        for ()
    }
    private static void displayAllOrders()
    {
        for (OrderInfo o1 : service.displayAllOrders())
        {
            System.out.println(o1.getOrderId() +"     "+o1.getCustomerName() +"     "+
                    o1.getTotalAmount() +"       "+o1.getProductName() +"      "+
                    o1.getProductQty());
        }
    }
}
