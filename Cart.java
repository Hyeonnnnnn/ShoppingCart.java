import java.util.Stack;
import java.util.Scanner;

public class Cart {
    Stack<Item> cart;
    public Scanner scanner;

    public Cart() {
        this.cart = new Stack<>();
        this.scanner = new Scanner(System.in);
    }

    public void addToCart() {
        System.out.print("\nEnter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter item price: P");
        double price = scanner.nextDouble();
        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();
        cart.push(new Item(name, price, quantity));
        System.out.println(name + " has been successfully added in your cart.");
    }

    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is currently empty.");
        } else {
            System.out.println("\nItems in your cart:");
            double total = 0;
            for (Item item : cart) {
                System.out.println(item);
                total += item.getTotalPrice();
            }
            System.out.println("\nTotal price to be paid: P" + total);
        }
    }

    public void replaceItem() {
        if (cart.isEmpty()) {
            System.out.println("\nThere's nothing to replace since your cart is empty.");
            return;
        }
        System.out.print("\nEnter the name of the item you want to update: ");
        String oldName = scanner.nextLine();
        System.out.print("Enter new item name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new item price: P");
        double newPrice = scanner.nextDouble();
        System.out.print("Enter new item quantity: ");
        int newQuantity = scanner.nextInt();

        Stack<Item> tempStore = new Stack<>();
        while (!cart.isEmpty()) {
            Item item = cart.pop();
            if (item.getName().equals(oldName)) {
                tempStore.push(new Item(newName, newPrice, newQuantity));
            } else {
                tempStore.push(item);
            }
        }
        while (!tempStore.isEmpty()) {
            cart.push(tempStore.pop());
        }
    }
    public void removeItem() {
        if (!cart.isEmpty()) {
            cart.pop();
            System.out.println("\nThe item that you last added has been removed.");
        } else {
            System.out.println("\nYour cart is already empty and you want to remove an item, just throw this goddamn cart away.");
        }
    }

    public void searchCart() {
        if (cart.isEmpty()) {
            System.out.println("\nThere's nothing to search in your cart since it's empty.");
        } else {
            System.out.print("\nEnter a keyword to search in your cart: ");
            String keyword = scanner.nextLine();
            boolean found = false;
            for (Item item : cart) {
                if (item.getName().toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println(item);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("\nThere are no items in your cart that match the keyword '" + keyword + "'.");
            }
        }
    }

    public void clearCart() {
        if (cart.isEmpty()){
            System.out.println("Your cart is already empty.");
        } else {
            cart.clear();
            System.out.println("Your cart has been cleared.");
        }
    }
}
