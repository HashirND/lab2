package ca.ucalgary.ensf380;


package ca.ucalgary.ensf380;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	    // Lists to store different entities
	    static List<Client> clients = new ArrayList<>();
	    static List<Pet> pets = new ArrayList<>();

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean running = true;

	        while (running) {
	            displayMenu();
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    manageClients(scanner);
	                    break;
	                case 2:
	                    managePets(scanner);
	                    break;
	                // ... other cases for managing bookings, payments, reports
	                case 0:
	                    running = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	            }
	        }
	        scanner.close();
	    }

	    private static void displayMenu() {
	        System.out.println("YYC Pet Resort Management System");
	        System.out.println("1. Manage Clients");
	        System.out.println("2. Manage Pets");
	        // ... other menu options
	        System.out.println("0. Exit");
	        System.out.print("Enter your choice: ");
	    }

	    private static void manageClients(Scanner scanner) {
	        System.out.println("Manage Clients");
	        System.out.println("1. Add Client");
	        System.out.println("2. View Clients");
	        System.out.print("Enter your choice: ");
	        int clientChoice = scanner.nextInt();

	        switch (clientChoice) {
	            case 1:
	                addClient(scanner);
	                break;
	            case 2:
	                viewClients();
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }
	    }

	    private static void addClient(Scanner scanner) {
	        System.out.print("Enter client ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();  // Consume newline
	        System.out.print("Enter full name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter contact number: ");
	        String contact = scanner.nextLine();
	        System.out.print("Enter home address: ");
	        String address = scanner.nextLine();

	        Client client = new Client();
	        client.setId(id);
	        client.setName(name);
	        client.setPhoneNumber(contact);
	        client.setAddress(address);

	        clients.add(client);
	        System.out.println("Client added successfully!");
	    }

	    private static void viewClients() {
	        System.out.println("List of Clients:");
	        for (Client client : clients) {
	            System.out.println("ID: " + client.getId() + ", Name: " + client.getName() +
	                    ", Contact: " + client.getPhoneNumber() + ", Address: " + client.getAddress());
	        }
	    }

	    private static void managePets(Scanner scanner) {
	        System.out.println("Manage Pets");
	        System.out.println("1. Add Pet");
	        System.out.println("2. View Pets");
	        System.out.print("Enter your choice: ");
	        int petChoice = scanner.nextInt();

	        switch (petChoice) {
	            case 1:
	                addPet(scanner);
	                break;
	            case 2:
	                viewPets();
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }
	    }

	    private static void addPet(Scanner scanner) {
	        System.out.print("Enter pet ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();  // Consume newline
	        System.out.print("Enter pet name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter species: ");
	        String species = scanner.nextLine();
	        System.out.print("Enter breed: ");
	        String breed = scanner.nextLine();
	        System.out.print("Enter pet age: ");
	        int age = scanner.nextInt();

	        Pet pet = new Pet();
	        pet.setId(id);
	        pet.setName(name);
	        pet.setSpecies(species);
	        pet.setBreed(breed);
	        pet.setAge(age);

	        pets.add(pet);
	        System.out.println("Pet added successfully!");
	    }

	    private static void viewPets() {
	        System.out.println("List of Pets:");
	        for (Pet pet : pets) {
	            System.out.println("ID: " + pet.getId() + ", Name: " + pet.getName() +
	                    ", Species: " + pet.getSpecies() + ", Breed: " + pet.getBreed() +
	                    ", Age: " + pet.getAge());
	        }
	    }
	}
