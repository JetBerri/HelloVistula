import module java.base;

public class Main {
    public static void main(String[] args) {

        int setMinVal = 1;
        int setMaxVal = 100;

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(setMinVal, setMaxVal);
        }

        System.out.println(Arrays.toString(arr));

        int i = 0;

        int minVal = 100;
        int maxVal = 0;

        while(i < 10){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
            if (arr[i] < minVal){
                minVal = arr[i];
            }
            i ++;
        }

        IO.println("Max: " + maxVal);
        IO.println("Min: " + minVal);

    }
}
