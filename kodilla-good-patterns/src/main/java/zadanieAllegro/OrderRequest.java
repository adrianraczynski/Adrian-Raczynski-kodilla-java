package zadanieAllegro;

public class OrderRequest {

    public User user;
    public Product product;

    public OrderRequest(final User user, final Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }


}
