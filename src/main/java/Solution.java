import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    private static NumberFormat formatter = new DecimalFormat("#0.000000");
    private static int countOfPositiveNumbers = 0;
    private static int countOfNegativeNumbers = 0;
    private static int countOfZeros = 0;

    private
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float numberOfElements = arr.length;
        for (int value : arr) {
            if (value > 0) {
                countOfPositiveNumbers++;
            } else if (value < 0) {
                countOfNegativeNumbers++;
            } else {
                countOfZeros++;
            }
        }
        List<Integer> totalCount = Arrays.asList(countOfPositiveNumbers, countOfNegativeNumbers, countOfZeros);
        List<Float> results = totalCount.stream().map(number -> number / numberOfElements).collect(Collectors.toList());
        results.forEach(result -> System.out.println(formatter.format(result)));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
