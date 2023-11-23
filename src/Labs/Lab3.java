package Labs;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Lab3 {

    public static void main(String[] args) {
          double[] prices = {15.5, 20, 30.2, 10.1, 5};
          double average;
          OptionalDouble max;
          double min;

          average = ((prices[0] + prices[1] + prices[2] + prices[3] + prices[4]) / prices.length);
          max = Arrays.stream(prices).max();
          System.out.println("The array has " + prices.length + " elements");
          System.out.println("The array highest value is " + Arrays.stream(prices).max());
          System.out.println("The array lowest value is " + Arrays.stream(prices).min());
          System.out.println("The average for the array elements is " + average);

    }

}

/*
Solution
public static int findMax(int[] arr) {
    int max = arr[0];
    for (i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

public static int findMin(int[] arr) {
    int min = arr[0];
    for (i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}

public static int findAvg(int[] arr) {
    int sum = 0;
    for (i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
    }
    return sum / arr.length;
}
 */