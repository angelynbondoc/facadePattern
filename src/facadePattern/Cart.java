package facadePattern;

public class Cart implements HotelService {
    private int numberOfCarts;
    
    public void setNumberOfCarts(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }
    
    public void requestCart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
        System.out.println("Cart: Delivering " + numberOfCarts + " luggage cart(s)");
    }
    
    @Override
    public void performService() {
        if (numberOfCarts > 0) {
            System.out.println("Cart: Delivering " + numberOfCarts + " luggage cart(s)");
        }
    }
}