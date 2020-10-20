import java.util.ArrayList;
import java.util.Collections;

public class ProductManager {
    ArrayList<Product> products = new ArrayList<>();

    public void create(Product product) {
        products.add(product);
    }

    public void read() {
        for (Product p : products) {
            System.out.println(p.toString());
        }
    }

    public void update(Product product) {
        try {
            for (Product p : products) {
                if (product.getId() == p.getId()) {
                    p.setName(product.getName());
                    p.setPrice(product.getPrice());
                }
            }
        } catch (Exception e) {
            System.out.println("Can't do this");
        }
    }

    public void delete(int id) {
        Product product = new Product();
        for (Product productDelete : products) {
            if (productDelete.getId() == id) {
                product = productDelete;
            }
        }
        products.remove(product);
    }

    public void search(String name) {
        for (Product searchProduct : products) {
            if (searchProduct.getName().equals(name)) {
                System.out.println(searchProduct);
            }
        }
    }

    public void sort(){
        Product product = new Product();
        Collections.sort(products,product);
    }

}
