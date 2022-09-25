
public class Program {
    
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager("orders.txt");
        orderManager.run();
    }
}
