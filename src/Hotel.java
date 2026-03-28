import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
        // Initialize with some rooms
        rooms.add(new SingleRoom(101, 1000.0));
        rooms.add(new SingleRoom(102, 1000.0));
        rooms.add(new DoubleRoom(201, 1800.0));
        rooms.add(new DoubleRoom(202, 1800.0));
    }

    public void displayAllRooms() {
        System.out.println("--- Hotel Room Status ---");
        for (Room room : rooms) {
            room.displayDetails();
        }
    }

    public void bookRoom(int roomNumber) throws RoomAlreadyBookedException, InvalidRoomNumberException {
        Room room = findRoom(roomNumber);
        if (room.isBooked()) {
            throw new RoomAlreadyBookedException("Room " + roomNumber + " is already booked.");
        }
        room.setBooked(true);
        System.out.println("Room " + roomNumber + " has been successfully booked.");
    }

    public void cancelBooking(int roomNumber) throws RoomNotBookedException, InvalidRoomNumberException {
        Room room = findRoom(roomNumber);
        if (!room.isBooked()) {
            throw new RoomNotBookedException("Room " + roomNumber + " is not currently booked.");
        }
        room.setBooked(false);
        System.out.println("Booking for Room " + roomNumber + " has been successfully cancelled.");
    }

    private Room findRoom(int roomNumber) throws InvalidRoomNumberException {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        throw new InvalidRoomNumberException("Room " + roomNumber + " does not exist.");
    }
}
