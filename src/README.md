# PCCCS495 – Term II Project

## Project Title
Hotel Booking System

## Problem Statement (max 150 words)
A console-based Java application to manage hotel room reservations, allowing users to view availability, check room details, book, and cancel bookings. It features Single and Double room types through inheritance and an abstract base class. The system implements core OOP principles—abstraction, inheritance, polymorphism, and exception handling—and includes error management for scenarios like booking reserved rooms or invalid room numbers. It is modular and menu-driven for efficient hotel management.

## Target User
Hotel receptionists, hotel managers, and hotel staff who need to manage room availability, bookings, and cancellations efficiently in a small hotel or guest house.

## Core Features
- View all available hotel rooms
- Display room details (room number, type, price, booking status)
- Book a room for a customer
- Cancel an existing booking
- Error handling for invalid booking or unavailable rooms
- Menu-driven console interface

## OOP Concepts Used
- **Abstraction:** Using an abstract `Room` class to define common properties and behaviors.
- **Inheritance:** `SingleRoom` and `DoubleRoom` classes inherit from the `Room` class.
- **Polymorphism:** Methods like `displayDetails()` are overridden in different room types.
- **Exception Handling:** Custom exceptions to handle errors such as booking an already booked room.
- **Collections / Threads:** Using `ArrayList` to store and manage room objects.

## Proposed Architecture Description
The system follows a modular object-oriented architecture. The abstract `Room` class defines the basic structure and functionality common to all rooms. Specific room types such as `SingleRoom` and `DoubleRoom` extend this class and implement their own details using polymorphism. The `Hotel` class acts as the central management component that stores room objects in an `ArrayList` and manages booking and cancellation operations. Custom exception classes handle error situations. The `Main` class provides a menu-driven interface that allows the user to interact with the system and perform different booking operations.

## How to Run
1. Navigate to the `src` directory: `cd src`
2. Compile all Java files: `javac *.java`
3. Run the application: `java Main`

## Git Discipline Notes
Minimum 10 meaningful commits required.
