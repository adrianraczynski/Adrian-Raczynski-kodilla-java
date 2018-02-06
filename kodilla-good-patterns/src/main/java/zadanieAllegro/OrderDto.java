package zadanieAllegro;

public class OrderDto {

    public User user;
    public Product product;
    public boolean isOrder;

    public OrderDto(final User user, final Product product, final boolean isOrder) {
        this.user = user;
        this.product = product;
        this.isOrder = isOrder;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
