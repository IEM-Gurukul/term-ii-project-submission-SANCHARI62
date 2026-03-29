public class SingleRoom extends Room {
    public SingleRoom(int roomNumber, double price) {
        super(roomNumber, price);
    }

    @Override
    public String getRoomType() {
        return "Single Room";
    }

    @Override
    public void displayDetails() {
        System.out.println("Room Number: " + getRoomNumber() + " | Type: " + getRoomType() + " | Price: " + getPrice() + " | Status: " + (isBooked() ? "Booked" : "Available"));
    }
}
