import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

class Cart<T extends Product> {
    private List<T> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(T product) {
        products.add(product);
    }

    public void removeProduct(T product) {
        products.remove(product);
    }

    public double getTotalPrice() {
        double total = 0;
        for (T product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Products in the cart:");
            for (T product : products) {
                System.out.println(product);
            }
        }
    }
}
public class generic {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.50);
        Product product2 = new Product("Smartphone", 800.75);

        Cart<Product> cart = new Cart<>();
        cart.addProduct(product1);
        cart.addProduct(product2);

        cart.displayCart();

        // Display total price
        System.out.println("Total Price: $" + cart.getTotalPrice());
    }
}
