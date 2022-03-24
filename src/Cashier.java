import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cashier {
    public void printAReceipt(Cart cart, Date date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Date: " + dateFormat.format(date) + "\n\n---Products---\n\n");
        cart.applyDiscount();
        for(StoreProduct s : cart.getProducts()) {
            System.out.println(s);
        }
        System.out.println("------------------------------------------------\n");
        System.out.println("SUBTOTAL: $" + (double)(Math.round(cart.getTotalPrice() * 100)) / 100);
        System.out.println("DISCOUNT: -$" + (double)(Math.round(cart.getTotalDiscount() * 100)) / 100);
        System.out.println("\nTOTAL: $" + (double)(Math.round((cart.getTotalPrice() - cart.getTotalDiscount()) * 100)) / 100);

    }
}
