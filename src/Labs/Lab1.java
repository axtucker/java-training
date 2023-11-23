package Labs;

import java.sql.SQLOutput;

public class Lab1 {

    public static void main(String[] args) {
          // Write a function that takes a value N and returns the sum of 1 to N

          /* int counter = 5;
          int total = 0;
          if (counter > 0) {
                total = total + counter;
                System.out.println(total);
                System.out.println(counter);

          }
          counter = counter - 1;
          System.out.println(counter);

          System.out.println("The total is: " + total);

    }
}
*/

          //  Solution
          System.out.println(sum(5));
    }

      public static int sum(int n) {
            int sum=0;
            for (int i = 0; i <= n; i++) {
            System.out.print(sum + " + " + i);
                  sum = sum + i;
                  System.out.println(" = " + sum);
    }
    return sum;
    }
}


