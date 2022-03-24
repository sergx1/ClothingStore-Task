public class Jacket extends StoreProduct {

    public Jacket(String name, String brand, double price, int size, String color) {
        super(name, brand, price, size, color);

        if(!checkSize(size)) {
            System.err.println("Invalid value for jacket size");
            System.exit(-1);
        }
    }

    @Override
    public double discountOnTuesday() {
        return 0;
    }

    public boolean checkSize(int size) {
        if(size < 42 || size > 66 || (size % 2) == 1)
            return false;
        return true;
    }
}
