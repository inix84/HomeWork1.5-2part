import java.util.Arrays;
public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
                java.util.Random random = new java.util.Random();
                int[] arr = new int[30];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = random.nextInt(100_000) + 100_000;
                }
                return arr;
            }
    public static void main(String[] args) {
int sum=0;
        for (int element: generateRandomArray()) {
            sum+=element;
        }
        System.out.println( "Сумма трат за месяц составила "+sum+ " рублей");
    }
}