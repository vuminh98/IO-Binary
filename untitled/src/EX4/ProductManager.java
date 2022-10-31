package EX4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements Serializable{

        ArrayList<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void add(Scanner scanner) {
        System.out.println("Input id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input brand: ");
        String brand = scanner.nextLine();
        System.out.println("Input price: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Input description: ");
        String des = scanner.nextLine();
        products.add(new Product(id, name, brand, price, des));
        writeBinaryFile();
    }

    public void search(Scanner scanner) {
        System.out.println("Input id: ");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (equals(products.get(i).getId() == index) ) {
                System.out.println(products);
            }
        }
    }

    public void display() {
        for (Product product: products) {
            System.out.println(product);
        }
    }

    public void writeBinaryFile() {
        File file = new File("binary3");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(products);
            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readBinaryFile() {
        File file = new File("binary3");
        ArrayList<Product> products1 = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                products1 = (ArrayList<Product>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println();;
        }
        products = products1;
    }
}
