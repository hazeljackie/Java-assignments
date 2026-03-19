public class StoreMain {

    public static void main(String[] args) {

        Store store = new Store();

        Product p1 = new Product("P1","Laptop",70000,15);
        Product p2 = new Product("P2","Phone",30000,20);
        Product p3 = new Product("P3","Headphones",2000,8);
        Product p4 = new Product("P4","Keyboard",1500,5);

        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);
        store.addProduct(p4);

        store.sellProduct("P1",5);
        p3.restock(5);

        System.out.println("All Products:");
        store.displayAllProducts();

        System.out.println("\nLow Stock Products:");
        store.listLowStock();
    }
}
