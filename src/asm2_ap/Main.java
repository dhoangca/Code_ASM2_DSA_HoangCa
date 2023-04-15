/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm2_ap;

/**
 *
 * @author Dell
 */
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        AnimalManagement animalManagement = new AnimalManagement();
//        Scanner scanner = new Scanner(System.in);
//
//        boolean running = true;
//        while (running) {
//            System.out.println("========= Pet Management System ==========");
//            System.out.println("\nEnter an option:");
//            System.out.println("1. Add an animal");
//            System.out.println("2. Edit an animal");
//            System.out.println("3. Delete an animal");
//            System.out.println("4. Search for an animal");
//            System.out.println("5. Display all animals");
//            System.out.println("6. Exit");
//            System.out.println("==========================================");
//            int option = scanner.nextInt();
//
//            switch (option) {
//                case 1:
//                    System.out.println("\n== Add an animal ==\n");
//                   System.out.println("\nEnter animal ID:");
//                    int id = scanner.nextInt();
//                    scanner.nextLine(); // consume newline character
//                    System.out.println("Enter animal name:");
//                    String name = scanner.nextLine();
//                    System.out.println("Enter animal age:");
//                    int age = scanner.nextInt();
//                    System.out.println("Enter bird wing span:");
//                    double wingSpan = scanner.nextDouble();
//                    animalManagement.addAnimal(id, name, age, wingSpan);
//                    System.out.println("Bird added.");
//                    break;
//                case 2:
//                    System.out.println("\n== Edit an animal ==\n");
//                    System.out.println("\nEnter animal ID to edit:");
//                    int editId = scanner.nextInt();
//                    scanner.nextLine(); // consume newline character
//                    Animal editAnimal = animalManagement.searchAnimal(editId);
//                    if (editAnimal != null) {
//                        System.out.println("Enter new animal name:");
//                        String newName = scanner.nextLine();
//                        System.out.println("Enter new animal age:");
//                        int newAge = scanner.nextInt();
//                        editAnimal.setName(newName);
//                        editAnimal.setAge(newAge);
//                        System.out.println("Animal edited.");
//                    }
//                    break;
//                case 3:
//                    System.out.println("\n== Delete an animal ==\n");
//                    System.out.println("\nEnter animal ID to delete:");
//                    int deleteId = scanner.nextInt();
//                    animalManagement.deleteAnimal(deleteId);
//                    System.out.println("Animal deleted.");
//                    break;
//                case 4:
//                    System.out.println("\n== Search for an animal ==\n");
//                    System.out.println("\nEnter animal ID to search:");
//                    int searchId = scanner.nextInt();
//                    Animal searchAnimal = animalManagement.searchAnimal(searchId);
//                    if (searchAnimal != null) {
//                        System.out.println(searchAnimal.getId() + "\t" + searchAnimal.getName() + "\t" + searchAnimal.getAge());
//                    }
//                    break;
//                case 5:
//                    System.out.println("\n== Display all animals ==\n");
//                    System.out.println("\nAll animals:");
//                    animalManagement.displayList();
//                    break;
//                case 6:
//                    running = false;
//                    break;
//                default:
//                    System.out.println("\nInvalid option.");
//                    break;
//            }
//        }
//    }
// // =====================================================================
//    
//}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AnimalManagement animalManagement = new AnimalManagement();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            try {
            printMenu();

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addAnimal(animalManagement, scanner);
                    break;
                case 2:
                    editAnimal(animalManagement, scanner);
                    break;
                case 3:
                    deleteAnimal(animalManagement, scanner);
                    break;
                case 4:
                    searchAnimal(animalManagement, scanner);
                    break;
                case 5:
                    displayAnimals(animalManagement);
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("\nInvalid option.");
                    break;
            }
             } catch (Exception e) {
                System.out.println("\nError occurred: " + e.getMessage());
                scanner.nextLine(); // consume the input buffer
            }
        }
    }

    public static void addAnimal(AnimalManagement animalManagement, Scanner scanner) {
    try {
        System.out.println("\n== Add an BIRD ==\n");
        System.out.println("Enter BIRD ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        System.out.println("Enter BIRD name:");
        String name = scanner.nextLine();
        System.out.println("Enter BIRD age:");
        int age = scanner.nextInt();
        System.out.println("Enter BIRD wing span:");
        double wingSpan = scanner.nextDouble();
        animalManagement.addAnimal(id, name, age, wingSpan);
        System.out.println("Bird added.");
    } catch (Exception e) {
        System.out.println("Invalid input. Please enter a valid input.");
        scanner.nextLine(); // consume invalid input
    }
}


   public static void editAnimal(AnimalManagement animalManagement, Scanner scanner) {
    System.out.println("\n== Edit an BIRD ==\n");
    System.out.println("Enter BIRD ID to edit:");
    int editId = scanner.nextInt();
    scanner.nextLine(); // consume newline character
    
    try {
        Animal editAnimal = animalManagement.searchAnimal(editId);
        if (editAnimal != null) {
            System.out.println("Enter new BIRD name:");
            String newName = scanner.nextLine();
            System.out.println("Enter new BIRD age:");
            int newAge = scanner.nextInt();
            editAnimal.setName(newName);
            editAnimal.setAge(newAge);
            System.out.println("BIRD edited.");
        }
        else {
            System.out.println("Unable to edit animal. Animal ID does not exist.");
        }
    } catch (Exception e) {
        System.out.println("An error occurred while editing animal. Please try again.");
    }
}

    public static void deleteAnimal(AnimalManagement animalManagement, Scanner scanner) {
    System.out.println("\n== Delete an BIRD ==\n");
    System.out.println("Enter BIRD ID to delete:");
    try {
        int deleteId = scanner.nextInt();
        animalManagement.deleteAnimal(deleteId);
        System.out.println("BIRD deleted.");
    } catch (Exception e) {
        System.out.println("An error occurred while deleting animal. Please try again.");
        scanner.next(); // consume the invalid input
    }
}

   public static void searchAnimal(AnimalManagement animalManagement, Scanner scanner) {
    System.out.println("\n== Search for an BIRD ==\n");
    System.out.println("Enter BIRD ID to search:");
    int searchId = scanner.nextInt();
    try {
        Animal searchAnimal = animalManagement.searchAnimal(searchId);
        if (searchAnimal != null) {
            System.out.println(searchAnimal.getId() + "\t" + searchAnimal.getName() + "\t" + searchAnimal.getAge());
        } else {
            System.out.println("BIRD not found.");
        }
    } catch (Exception e) {
        System.out.println("An error occurred while searching for animal. Please try again.");
        scanner.next(); // consume the invalid input
    }
}

    public static void displayAnimals(AnimalManagement animalManagement) {
        System.out.println("\n== Display all BIRD ==\n");
        System.out.println("All BIRDs:");
        animalManagement.displayList();
    }

    public static void printMenu() {
        System.out.println("========= Bird management system ==========");
        System.out.println("\nEnter an option:");
        System.out.println("_ 1. Add an BIRD _");
        System.out.println("_2. Edit an BIRD_ ");
        System.out.println("_3. Delete an BIRD_ ");
        System.out.println("_4. Search for an BIRD_ ");
        System.out.println("_5. Display all BIRD_");
        System.out.println("_6. Exit_ ");
        System.out.println("==========================================");
    }
}
