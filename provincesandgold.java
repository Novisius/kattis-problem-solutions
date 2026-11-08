import java.util.*;

/*
URL to problem: https://open.kattis.com/problems/provincesandgold
Date Completed: 2025-08-29 18:03:56
Problem Difficulty: 1.3 (easy)
*/

public class provincesandgold {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt()*3;
        int y = sc.nextInt()*2;
        int z = sc.nextInt();

        int t = x+y+z;

        if (t >= 8) {
            System.out.print("Province or ");
        } else if (t >= 5) {
            System.out.print("Duchy or ");
        } else if (t >= 2) {
            System.out.print("Estate or ");
        }

        if (t >= 6) {
            System.out.print("Gold");
        } else if (t >= 3) {
            System.out.print("Silver");
        } else {
            System.out.print("Copper");
        }
    }
}

