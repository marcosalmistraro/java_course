public class Main {

    public static void main(String[] args){

        Truck volvo = new Truck(120, 10000, 5000);
        System.out.println(volvo);
        System.out.println("The max PayLoad is " + volvo.getMaxPayload());

    }
}