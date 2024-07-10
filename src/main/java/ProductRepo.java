import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private List<Product> products;

    public ProductRepo() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.id() == id)
                return product;
        }
        System.out.println("Die ID: " + id + " gehoert zu keinem Produkt.");
        return null;
    }
}
