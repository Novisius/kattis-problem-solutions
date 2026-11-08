import java.util.*;
import java.math.BigInteger;

/*
URL to problem: https://open.kattis.com/problems/simpleaddition
Date Solved: 2025-08-29 18:26:57
Difficulty: 2.9 (medium)
*/

public class simpleaddition {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger x = new BigInteger(sc.next());
        BigInteger y = new BigInteger(sc.next());

        System.out.print(x.add(y));
    }
}
