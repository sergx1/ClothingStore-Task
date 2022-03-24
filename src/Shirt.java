public class Shirt extends StoreProduct {

    public Shirt(String name, String brand, double price, String size, String color) {
        super(name, brand, price, size, color);

        if(!checkSize(size)) {
            System.err.println("Invalid value for shirt size");
            System.exit(-1);
        }
    }

    @Override
    public double discountOnTuesday() {
        return 10;
    }

    public boolean checkSize(String size) {
        if(size.equalsIgnoreCase("XS")) return true;
        if(size.equalsIgnoreCase("S")) return true;
        if(size.equalsIgnoreCase("M")) return true;
        if(size.equalsIgnoreCase("L")) return true;
        if(size.equalsIgnoreCase("XL")) return true;
        if(size.equalsIgnoreCase("2XL")) return true;
        return false;
    }
}
