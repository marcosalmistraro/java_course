
public class Order {
    
    public String name;
    private int blueberry;
    private int chocolate;
    private int redVelvet;

    public Order(String name, int blueberry, int chocolate, int redVelvet) {
        this.name = name;
        this.blueberry = blueberry;
        this.chocolate = chocolate;
        this.redVelvet = redVelvet;
    }

    public double totalPrice() {
        double tmp1 = blueberry * 3.0;
        double tmp2 = chocolate * 2.5;
        double tmp3 = redVelvet * 3.5;
        double totalPrice = tmp1 + tmp2 + tmp3;
        return totalPrice;
    }

    @Override
    public String toString() {
        String output = "\n";
        output += "----------" + "\n";
        output += "Order by " + name + ": \n";
        output += "----------" + "\n";
        output += "number of blueberry muffins: " + blueberry + "\n";
        output += "number of chocolate muffins: " + chocolate + "\n";
        output += "number of red velvet muffins: " + redVelvet + "\n";
        output += "----------" + "\n";
        output += "TOTAL PRICE: " + totalPrice() + " €\n";
        output += "----------" + "\n";
        return output;
    }
}