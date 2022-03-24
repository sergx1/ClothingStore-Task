public class Shoes extends StoreProduct{

    public Shoes(String name, String brand, double price, int size, String color) {
        super(name, brand, price, size, color);

        if(!checkSize(size)) {
            System.err.println("Invalid value for shoes size");
            System.exit(-1);
        }
    }

    @Override
    public double discountOnTuesday() {
        return 25;
    }

    public boolean checkSize(int size) {
        if(size < 39 || size > 46)
            return false;
        return true;
    }
}
