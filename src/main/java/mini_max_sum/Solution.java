package mini_max_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static List<Long> minValues = new ArrayList<>();
    private static Integer sumMinValue = 0;

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {


        Arrays.sort(arr);
        for (int i : arr) {
            sumMinValue = 0;
            Long sum = sumsNumbers(arr);
            sum -= i;
            minValues.add(sum);
        }
        Long[] integers = minValues.toArray(new Long[minValues.size()]);
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }
        System.out.print(integers[integers.length - 1] + " " + integers[0]);


    }

    private static Long sumsNumbers(int[] arr) {
        for (int value : arr) {
            sumMinValue += value;
        }
        return Integer.toUnsignedLong(sumMinValue);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
