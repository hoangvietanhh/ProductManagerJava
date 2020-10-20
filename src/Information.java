import java.util.Scanner;

public class Information {
    Scanner input = new Scanner(System.in);

    public Product addInformation(){
        Product product = new Product();
        System.out.println("Enter your product ID: ");
        product.setId(Integer.parseInt(input.nextLine()));
        System.out.println("Enter your product name: ");
        product.setName(input.nextLine());
        System.out.println("Enter your product price: ");
        product.setPrice(Integer.parseInt(input.nextLine()));
        return product;
    }
}
