public class Car {

    private String model;
    private String brand;
    private double price;
    private int year;
    private String color;
    private int quantity;

    public Car(String model, String brand, double price, int year, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.year = year;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public int delivery(){
        quantity++;
        return quantity;
    }

    public int sell(){
        if (quantity > 0) {
            quantity--;
        } else {
            System.out.println("No stock available for " + brand + " " + model);
        }
        return quantity;
    }

    @Override
    public String toString() {
        return "Car{model='" + model + "', brand='" + brand + "', price=" + price
                + ", year=" + year + ", color='" + color + "', quantity=" + quantity + "}";
    }

}
