package Labs;

public class Lab2 {
    public static void main(String[] args) {
        // Write a function that computes factorial. Hint - use recursion.  N = n*(n-1)! = n*(n-1)*(n-2)! = N*(n-1)*(n-2)*(n-3)!
        System.out.println("Factorial: " + fact(5));
    }
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return fact(n-1) * n;
    }
}



    /*
    Solution.  I had no idea how to do this

    public static void main(String[] args) {
        //Solution.  I had no idea
        public static int factorial(int n) {
            if (n == 0) {
                return 1;
            }
            else if (n == 1) {
                return 1;
            }
            return factorial(n-1) * n;
        }

    }
}

     */

