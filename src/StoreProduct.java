public abstract class StoreProduct <T> {
    private String name;
    private String brand;
    private double price;
    private T size;
    private String color;
    private double discount;

    public StoreProduct(String name, String brand, double price, T size, String color) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.size = size;
        this.color = color;
        this.discount = 0;
    }

    public abstract double discountOnTuesday();

    public String getName() { return name; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }
    public T getSize() { return size; }
    public String getColor() { return color; }


    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        double printDiscount = price * discount / 100;
        return  name + " - " + brand + "\n$" + price + "\n#discount " + (int)discount + "% -$" + (double)Math.round(printDiscount*100)/100 + "\n";
    }
}
