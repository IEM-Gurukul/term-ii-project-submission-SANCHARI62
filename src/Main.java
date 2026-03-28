import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Hotel Booking System");

        while (running) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. View All Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel a Booking");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    hotel.displayAllRooms();
                    break;
                case 2:
                    System.out.print("Enter room number to book: ");
                    try {
                        int bookRoomNum = Integer.parseInt(scanner.nextLine());
                        hotel.bookRoom(bookRoomNum);
                    } catch (RoomAlreadyBookedException | InvalidRoomNumberException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Please enter a valid room number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter room number to cancel booking: ");
                    try {
                        int cancelRoomNum = Integer.parseInt(scanner.nextLine());
                        hotel.cancelBooking(cancelRoomNum);
                    } catch (RoomNotBookedException | InvalidRoomNumberException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Please enter a valid room number.");
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
