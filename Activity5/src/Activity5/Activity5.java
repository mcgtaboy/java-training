/**
 * 
 */
package Activity5;

/**
 * 
 */

public class Activity5 {

    public static int Sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = Sum(50);
        System.out.println("Sum: " + result);
    }
}

