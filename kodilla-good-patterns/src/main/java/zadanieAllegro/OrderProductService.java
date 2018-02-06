package zadanieAllegro;

public class OrderProductService implements OrderService {


    @Override
    public boolean order(User user, Product product) {

        System.out.println("User buy: " + "\n" + product + "\n");
        return true;
    }
}
