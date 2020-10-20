import java.util.Collections;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Information information = new Information();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1: Create");
            System.out.println("2: Update");
            System.out.println("3: Delete");
            System.out.println("4: Show List");
            System.out.println("5: Search");
            System.out.println("6: Sort");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:

                    Product addProduct = information.addInformation();
                    productManager.create(addProduct);
                    productManager.read();

                    break;
                case 2:
                    Product updateProduct = information.addInformation();
                    productManager.update(updateProduct);
                    productManager.read();

                    break;
                case 3:
                    System.out.println("Enter your product ID to delete: ");
                    int idRemove = Integer.parseInt(input.nextLine());
                    productManager.delete(idRemove);
                    productManager.read();

                    break;
                case 4:
                    productManager.read();
                    input.nextLine();
                    break;
                case 5:
                    System.out.println("Enter your Name to search: ");
                    String nameSearch = input.nextLine();
                    productManager.search(nameSearch);
                    break;
                case 6:
                    productManager.sort();
                    productManager.read();
                    input.nextLine();
            }
        }while (true);
    }
}
