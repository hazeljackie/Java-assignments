public class Store {

    private Product[] inventory = new Product[10];
    private int count = 0;

    public void addProduct(Product p) {
        inventory[count++] = p;
    }

    public void sellProduct(String productId, int quantity) {
        for (Product p : inventory) {
            if (p != null && p.getProductId().equals(productId)) {
                p.sell(quantity);
            }
        }
    }

    public void listLowStock() {
        for (Product p : inventory) {
            if (p != null && p.getQuantity() < 10) {
                p.displayProduct();
            }
        }
    }

    public void displayAllProducts() {
        for (Product p : inventory) {
            if (p != null) {
                p.displayProduct();
            }
        }
    }
}
