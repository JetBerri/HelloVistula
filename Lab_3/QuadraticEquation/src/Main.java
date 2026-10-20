import module java.base;

public class Main {
    public static void main(String[] args) {

        double a = Double.parseDouble(IO.readln("A: "));
        double b = Double.parseDouble(IO.readln("B: "));
        double c = Double.parseDouble(IO.readln("C: "));

        IO.println(String.format("a = %.2f, b = %.2f, c = %.2f", a, b, c));

        if (a == 0) {
            IO.println("Error: 'a' can't be zero.");
            return;
        }

        double d = b * b - 4 * a * c;

        int numberOfRoots;

        if (d > 0){
            numberOfRoots = 2;
        } else if (d == 0){
            numberOfRoots = 1;
        } else {
            numberOfRoots = 0;
        }

        switch (numberOfRoots) {
            case 2 -> {
                double x1 = (-b - Math.sqrt(d)) / (2 * a);
                double x2 = (-b + Math.sqrt(d)) / (2 * a);
                IO.println(String.format("x1 = %.2f, x2 = %.2f", x1, x2));
            }
            case 1 -> {
                double x1 = -b / (2 * a);
                IO.println(String.format("x1 = x2 = %.2f", x1));
            }
            default -> IO.println("No real roots.");
        }

    }
}
