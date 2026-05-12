import java.util.Scanner;

// Vehicle class
class Vehicle {
    String vehicleNumber;
    String vehicleType;
    int parkingHours;

    Vehicle(String vehicleNumber, String vehicleType, int parkingHours) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }
}

// Parking Slot class
class ParkingSlot {
    int slotNumber;
    boolean isOccupied;

    ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.isOccupied = false;
    }
}

// Parking System class
class ParkingSystem {
    ParkingSlot[] slots;

    ParkingSystem(int totalSlots) {
        slots = new ParkingSlot[totalSlots];
        for (int i = 0; i < totalSlots; i++) {
            slots[i] = new ParkingSlot(i + 1);
        }
    }

    void displayAvailableSlots() {
        int count = 0;
        for (ParkingSlot slot : slots) {
            if (!slot.isOccupied)
                count++;
        }
        System.out.println("\nAvailable Parking Slots: " + count);
    }

    int parkVehicle() {
        for (ParkingSlot slot : slots) {
            if (!slot.isOccupied) {
                slot.isOccupied = true;
                return slot.slotNumber;
            }
        }
        return -1;
    }

    int calculateBill(String type, int hours) {
        int rate;
        switch (type.toLowerCase()) {
            case "bike": rate = 10; break;
            case "car": rate = 20; break;
            case "truck": rate = 30; break;
            default: rate = 15;
        }
        return rate * hours;
    }

    void displayParkingDetails(Vehicle v, int slot) {
        int bill = calculateBill(v.vehicleType, v.parkingHours);

        System.out.println("\n----- PARKING DETAILS -----");
        System.out.println("Vehicle Number : " + v.vehicleNumber);
        System.out.println("Vehicle Type   : " + v.vehicleType);
        System.out.println("Parking Hours  : " + v.parkingHours);
        System.out.println("Parked Slot    : " + slot);
        System.out.println("Total Bill     : Rs. " + bill);
    }
}

// Main class
public class SmartParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingSystem ps = new ParkingSystem(5);

          System.out.println("\n----------WELCOME TO SMART PARKING SYSTEM----------");

        char choice;
        do {
            ps.displayAvailableSlots();

            System.out.print("Enter vehicle number: ");
            String vno = sc.next();

            System.out.print("Enter vehicle type (Bike/Car/Truck): ");
            String vtype = sc.next();

            System.out.print("Enter parking hours: ");
            int hours = sc.nextInt();

            Vehicle v = new Vehicle(vno, vtype, hours);
            int slot = ps.parkVehicle();

            if (slot != -1) {
                System.out.println("\nVehicle parked at slot \"" + slot + "\"");
                ps.displayParkingDetails(v, slot);
            } else {
                System.out.println("No parking slots available");
            }

            System.out.print("\nDo you want to park another vehicle? (y/n): ");
            choice = sc.next().charAt(0);

        } 

         while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Smart Parking System\n");
        sc.close();
    }
}

