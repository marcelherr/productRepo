public class Main {
    public static void main(String[] args) {

        ProductRepo repo = new ProductRepo();

        repo.addProduct(new Product(1, "MacBook Air", 1299.99));
        repo.addProduct(new Product(2, "iPhone", 999.99));
        repo.addProduct(new Product(3, "Watch", 129.99));

        System.out.println(repo.getAllProducts());
        repo.removeProduct(new Product(1, "MacBook Air", 1299.99));
        System.out.println(repo.getAllProducts());
        System.out.println(repo.getProductById(3));
    }
}
