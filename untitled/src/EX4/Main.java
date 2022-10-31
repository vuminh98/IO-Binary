package EX4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        do {
            System.out.println("MENU");
            System.out.println("1. Add product");
            System.out.println("2. Search product");
            System.out.println("3. Display product");
            System.out.println("4. WriteBinaryFile");
            System.out.println("5. ReadBinaryFile");
            System.out.println("0. Exit");
            System.out.println("Input choice: ");
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Choose again:");
            }
            switch (choice) {
                case 1:
                    productManager.add(scanner);
                    break;
                case 2:
                    productManager.search(scanner);
                    break;
                case 3:
                    productManager.display();
                    break;
                case 4:
                    productManager.writeBinaryFile();
                    break;
                case 5:
                    productManager.readBinaryFile();
                    break;
                default:
                    System.exit(0);
            }
        } while (true);
    }
}
