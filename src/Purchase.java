import java.util.Calendar;
import java.util.Date;

public class Purchase {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH, 1);
        c.set(Calendar.MONTH, Calendar.FEBRUARY);
        c.set(Calendar.YEAR, 2022);
        Date date = c.getTime();
        Cart cart = new Cart(date);

        /*
        cart.addToCart(new Shirt("Blue Cotton Shirt", "BrandS", 14.99, "M", "blue"));
        cart.addToCart(new Shirt("White Cotton Shirt", "BrandS", 15.99, "M", "white"));
        cart.addToCart(new Trousers("Black Cotton Trousers", "BrandT", 29.99, 50, "white"));
        cart.addToCart(new Shoes("Black Leather Shoes", " BrandS", 59.99, 43, "black"));
        cart.addToCart(new Jacket("Black Cotton Suit Jacket", "BrandJ", 99.99, 50, "black"));
         */

        // cart.addToCart(new Shirt("Black Silk Shirt", "BrandS", 29.99, "L", "black"));
        // cart.addToCart(new Shirt("White Silk Shirt", "BrandS", 29.99, "L", "white"));

        cart.addToCart(new Trousers("Red Linen Trousers", "BrandT", 49.99, 56, "red"));
        cart.addToCart(new Shoes("Red Suede Shoes", "BrandS", 59.99, 44, "red"));
        cart.addToCart(new Shoes(" Black Suede Shoes", "BrandS", 59.99, 44, "black"));
        cart.addToCart(new Jacket("Red Linen Suit Jacket", " BrandJ", 99.99, 56, "red"));
        cart.addToCart(new Shirt("White Linen Shirt", "BrandS", 29.99, "L", "white"));


        Cashier cashier = new Cashier();
        cashier.printAReceipt(cart, date);

    }
}
