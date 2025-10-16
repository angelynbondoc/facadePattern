package facadePattern;

public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;
    
    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }
    
    
    public void requestValetService(String plateNumber) {
        System.out.println("FrontDesk: Processing valet service request...");
        valet.setPlateNumber(plateNumber);
        valet.performService();
        System.out.println("Valet service completed!\n");
    }
    
    public void requestRoomCleaning(int roomNumber) {
        System.out.println("FrontDesk: Processing room cleaning request...");
        houseKeeping.setRoomNumber(roomNumber);
        houseKeeping.performService();
        System.out.println("Room cleaning service completed!\n");
    }
    
    public void requestLuggageCart(int numberOfCarts) {
        System.out.println("FrontDesk: Processing luggage cart request...");
        cart.setNumberOfCarts(numberOfCarts);
        cart.performService();
        System.out.println("Luggage cart service completed!\n");
    }
    
    //check-in
    public void checkInGuest(int roomNumber, String plateNumber, int numberOfCarts) {
        System.out.println("Starting Guest Check-In...\n");
        requestValetService(plateNumber);
        requestRoomCleaning(roomNumber);
        requestLuggageCart(numberOfCarts);
        System.out.println("Guest check-in successfully!");
    }
    
    //check-out
    public void checkOutGuest(int roomNumber, String plateNumber) {
        System.out.println("Starting Guest Check-Out...\n");
        requestValetService(plateNumber);
        requestRoomCleaning(roomNumber);
        System.out.println("Guest check-out successfully!");
    }
}