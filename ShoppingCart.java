public class ShoppingCart {
    public static void main(String[] args) {
        Cart myCart = new Cart();

        while (true) {
            System.out.println("\nShopping Cart");
            System.out.println("1. Add to cart (Create).");
            System.out.println("2. View cart (Read).");
            System.out.println("3. Replace an item (Update).");
            System.out.println("4. Delete an item (Delete).");
            System.out.println("5. Search an item (Search).");
            System.out.println("6. Exit");
            System.out.print("\nChoose an option: ");

            int choice = myCart.scanner.nextInt();
            myCart.scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("\nEnter item name: ");
                    String name = myCart.scanner.nextLine();
                    System.out.print("Enter item price: P");
                    double price = myCart.scanner.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = myCart.scanner.nextInt();
                    myCart.addToCart(new Item(name, price, quantity));
                    System.out.println(name + " has been successfully added in your cart.");
                }
                case 2 -> myCart.viewCart();
                case 3 -> {
                    if (!myCart.cart.isEmpty()) {
                        System.out.print("\nEnter the name of the item you want to update: ");
                        String oldName = myCart.scanner.nextLine();
                        System.out.print("Enter new item name: ");
                        String newName = myCart.scanner.nextLine();
                        System.out.print("Enter new item price: P");
                        double newPrice = myCart.scanner.nextDouble();
                        System.out.print("Enter new item quantity: ");
                        int newQuantity = myCart.scanner.nextInt();
                        myCart.replaceItem(oldName, new Item(newName, newPrice, newQuantity));
                    } else {
                        System.out.println("\nThere's nothing to replace since your cart is empty.");
                    }
                }
                case 4 -> myCart.removeItem();
                case 5 -> {
                    myCart.searchCart();
                }
                case 6 -> System.exit(0);
            }
        }
    }
}
