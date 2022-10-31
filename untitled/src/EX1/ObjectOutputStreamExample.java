package EX1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("product.txt"));
            Product product = new Product(1, "IPhone 12", 2800, "New");
            oos.writeObject(product);
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("Successful!");
    }
}
