package facadePattern;

public class Valet implements HotelService {
    private String plateNumber;
    
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
    
    public void pickUpVehicle(String plateNumber) {
        this.plateNumber = plateNumber;
        System.out.println("Valet: Picking up vehicle with plate number " + plateNumber);
    }
    
    @Override
    public void performService() {
        if (plateNumber != null && !plateNumber.isEmpty()) {
            System.out.println("Valet: Picking up vehicle with plate number " + plateNumber);
        }
    }
}