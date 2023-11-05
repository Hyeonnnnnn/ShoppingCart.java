public class Item {
    public String name;
    public double price;
    public int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public String toString() {
        return name + " - P" + price + " (" + quantity + "pc/s) Total: P" + getTotalPrice();
    }
}
