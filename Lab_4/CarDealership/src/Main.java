public class Main{
    public static void main(String[] args) {

        Car car = new Car("M4", "BMW", 120000.0, 2026, "Green", 2);
        System.out.println(car);

        car.sell();
            System.out.println(car);

        System.out.printf("Brand: " + car.getBrand());
        System.out.printf("\nModel: " + car.getModel());
        System.out.printf("\nColor:" + car.getColor());
        System.out.printf("\nPrice: " + car.getPrice());
        System.out.printf("\nQuantity: " + car.getQuantity());
        System.out.printf("\nYear: " + car.getYear());

        car.setColor("Lime Green");
        car.setPrice(125000.0);
        car.setQuantity(5);
        System.out.println(car);
    }
}
