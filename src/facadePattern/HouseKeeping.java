package facadePattern;

public class HouseKeeping implements HotelService {
    private int roomNumber;
    
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public void cleanRoom(int roomNumber) {
        this.roomNumber = roomNumber;
        System.out.println("HouseKeeping: Cleaning room number " + roomNumber);
    }
    
    @Override
    public void performService() {
        if (roomNumber > 0) {
            System.out.println("HouseKeeping: Cleaning room number " + roomNumber);
        }
    }
}