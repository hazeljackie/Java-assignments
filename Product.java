public class Product {

    private String productId;
    private String name;
    private double price;
    private int quantityInStock;

    public Product(String productId, String name, double price, int quantityInStock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }


    public void updatePrice(double newPrice) {
        price = newPrice;
    }


    public void sell(int quantity) {
        if (quantity <= quantityInStock) {
            quantityInStock -= quantity;
        } else {
            System.out.println("Not enough stock for " + name);
        }
    }

    public void restock(int quantity) {
        quantityInStock += quantity;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantityInStock;
    }

    public void displayProduct() {
        System.out.println(productId + " | " + name +
                " | Price: " + price +
                " | Stock: " + quantityInStock);
    }
}
