package EX1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws Exception{
        ObjectInputStream oos = null;
        try {
            oos = new ObjectInputStream(new FileInputStream("product.txt"));
            Product product = (Product) oos.readObject();
            System.out.println(product);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }
    }
}
