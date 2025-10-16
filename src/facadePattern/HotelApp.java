package facadePattern;
import java.util.Scanner; 

public class HotelApp {
    private static Scanner sc = new Scanner(System.in);
    private static FrontDesk frontDesk = new FrontDesk();
    
    public static void main(String[] args) {
        boolean running = true;
        
        System.out.println("Simplified Hotel Management System\n");
        
        while (running) {
            displayMenu();
            int choice = getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    handleValetService();
                    break;
                case 2:
                    handleRoomCleaning();
                    break;
                case 3:
                    handleLuggageCart();
                    break;
                case 4:
                    handleCheckIn();
                    break;
                case 5:
                    handleCheckOut();
                    break;
                case 6:
                    System.out.println("\nThank you for using Hotel Management System!");
                    System.out.println("Goodbye!\n");
                    running = false;
                    break;
                default:
                    System.out.println("\nInvalid choice! Please try again.\n");
            }
        }
        
        sc.close();
    }
    
    private static void displayMenu() {
        System.out.println("Front Desk Services:");
        System.out.println("1. Request Valet Service");
        System.out.println("2. Request Room Cleaning");
        System.out.println("3. Request Luggage Cart");
        System.out.println("4. Check-In");
        System.out.println("5. Check-Out");
        System.out.println("6. Exit\n");
    }
    
    private static void handleValetService() {
        System.out.print("\nEnter vehicle plate number: ");
        String plateNumber = sc.nextLine();
        frontDesk.requestValetService(plateNumber);
    }
    
    private static void handleRoomCleaning() {
        int roomNumber = getIntInput("\nEnter room number: ");
        frontDesk.requestRoomCleaning(roomNumber);
    }
    
    private static void handleLuggageCart() {
        int numberOfCarts = getIntInput("\nEnter number of carts needed: ");
        frontDesk.requestLuggageCart(numberOfCarts);
    }
    
    private static void handleCheckIn() {
        System.out.println("Check-In");
        int roomNumber = getIntInput("Enter room number: ");
        System.out.print("Enter vehicle plate number: ");
        String plateNumber = sc.nextLine();
        int numberOfCarts = getIntInput("Enter number of luggage carts needed: ");
        
        frontDesk.checkInGuest(roomNumber, plateNumber, numberOfCarts);
    }
    
    private static void handleCheckOut() {
        System.out.println("Check-Out");
        int roomNumber = getIntInput("Enter room number: ");
        System.out.print("Enter vehicle plate number: ");
        String plateNumber = sc.nextLine();
        
        frontDesk.checkOutGuest(roomNumber, plateNumber);
    }
    
    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = Integer.parseInt(sc.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }
}