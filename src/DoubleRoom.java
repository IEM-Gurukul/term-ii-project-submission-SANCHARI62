public class DoubleRoom extends Room {
    public DoubleRoom(int roomNumber, double price) {
        super(roomNumber, price);
    }

    @Override
    public String getRoomType() {
        return "Double Room";
    }

    @Override
    public void displayDetails() {
        System.out.println("Room Number: " + getRoomNumber() + " | Type: " + getRoomType() + " | Price: " + getPrice() + " | Status: " + (isBooked() ? "Booked" : "Available"));
    }
}
