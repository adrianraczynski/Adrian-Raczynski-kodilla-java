package zadanieAllegro;

public class OrderProductRepository implements OrderRepository{

    public boolean createOrder(User user, Product product){

        System.out.println("\n" + "Sending information to database about: " + user + " and  purchased: " + product);
        return true;
    }
}
