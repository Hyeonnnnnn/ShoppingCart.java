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
            System.out.println("6. Clear cart");
            System.out.println("7. Exit");
            System.out.print("\nChoose an option: ");

            int choice = myCart.scanner.nextInt();
            myCart.scanner.nextLine();

            switch (choice) {
                case 1 -> myCart.addToCart();
                case 2 -> myCart.viewCart();
                case 3 -> myCart.replaceItem();
                case 4 -> myCart.removeItem();
                case 5 -> myCart.searchCart();
                case 6 -> myCart.clearCart();
                case 7 -> System.exit(0);
                default -> System.out.println("\nYou entered an invalid option.");
            }
        }
    }
}
