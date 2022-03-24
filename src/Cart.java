import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Cart {
    private ArrayList<StoreProduct> products;
    private Date dateOfPurchase;
    private double totalDiscount;
    private double totalPrice;

    public Cart(Date dateOfPurchase) {
        this.products = new ArrayList<>();
        this.dateOfPurchase = dateOfPurchase;
        this.totalDiscount = 0;
        this.totalPrice = 0;
    }

    public void addToCart(StoreProduct s) {
        products.add(s);
        totalPrice += s.getPrice();
    }

    public ArrayList<StoreProduct> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void applyDiscount() {
        Calendar c = Calendar.getInstance();
        c.setTime(dateOfPurchase);
        for(StoreProduct s : products) {
            if (c.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {
                s.setDiscount(s.discountOnTuesday());
            }
            if (products.size() >= 3) {
                if (s.getDiscount() < 20) {
                    s.setDiscount(20);
                }
            }
            totalDiscount += s.getPrice() * s.getDiscount() / 100;
        }
    }
}
