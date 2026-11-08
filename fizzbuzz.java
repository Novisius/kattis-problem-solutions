import java.util.*;

/*
URL to Problem: https://open.kattis.com/problems/fizzbuzz
Date Submitted: 2025-08-29 17:46:52
Problem Difficulty: 1.3 (easy)
*/

public class fizzbuzz {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i%x == 0 && i%y == 0) {
                System.out.println("FizzBuzz");
            } else if (i%x == 0) {
                System.out.println("Fizz");
            } else if (i%y == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
