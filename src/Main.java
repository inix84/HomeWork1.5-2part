import java.util.Arrays;
public class Main {
   // int[] arr = generateRandomArray();

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
//int sum1=0;
        int[] arr = generateRandomArray();
        for (int element: arr) {
            sum+=element;
        }
        System.out.println( "Сумма трат за месяц составила "+sum+ " рублей");

        //for (int index=0;index< arr.length;index++){
        //    sum1+=arr[index];
        //}
       //System.out.println( "Сумма трат за месяц составила "+sum1+ " рублей");

        int [] arr2=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr2);
        System.out.println( "Минимальная сумма трат за день составила "+arr2[0]+ " рублей");
        System.out.println( "Максимальная сумма трат за день составила "+arr2[arr2.length-1]+ " рублей");
    }
}