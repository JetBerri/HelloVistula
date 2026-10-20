import module java.base;

public class Main {
    public static void main(String[] args) {

        int setMinVal = 1;
        int setMaxVal = 100;

        int i = 0;

        int minVal = 100;
        int maxVal = 0;

        while(i < 10){
            int number = ThreadLocalRandom.current().nextInt(setMinVal, setMaxVal + 1);
            IO.println(number);

            if (number > maxVal){
                maxVal = number;
            }
            if (number < minVal){
                minVal = number;
            }
            i ++;
        }

        IO.println("Max: " + maxVal);
        IO.println("Min: " + minVal);

    }
}
