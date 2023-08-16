import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("apples", 4.60, 6),
                new Product("bananas", 2.50, 10),
                new Product("eggs", 6.25, 12),
                new Product("eggs", 6.25, 12),
                new Product("bread", 3.00, 8)
        ));

        System.out.println(products.toString());

    }
    static class Product {
        String product;
        double cost;
        int qty;

        public Product(String product, double cost, int qty) {
            this.product = product;
            this.cost = cost;
            this.qty = qty;
        }

        @Override
        public String toString() {
            return String.format("[product: %s\n  cost: %.2f\n  qty: %d]", product, cost, qty);
        }
    }
        }

/*
Output =
{[product: apples
  cost: 4.60
  qty: 6]
 [product: bananas
  cost: 2.50
  qty: 10]
 [product: eggs
  cost: 6.25
  qty: 12]
 [product: eggs
  cost: 6.25
  qty: 12]
 [product: bread
  cost: 3.00
  qty: 8]
}
 */
