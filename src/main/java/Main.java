import models.Person;
import models.Product;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 30, "Male");
        Product product = new Product("TV", 900.00, 10);
        product.setQuantity(product.getQuantity() + 30);
        System.out.println(product);
        System.out.println(person);
    }
}
