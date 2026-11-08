import java.util.Scanner;

/*
URL to problem: https://open.kattis.com/problems/photoencoding
Date completed: 2025-11-11 16:50:01
Difficulty: 2.1 (easy)
*/

public class photoencoding {
    public static void main(String[] args) {
        int[] arr = new int[201];
        int[] min = new int[201];

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int n = 0;

        int max = 0;

        for (int i = 0; i < x; i++) {
            n = sc.nextInt();
            arr[n]++;
        }

        for (int i = 0; i < 201; i++) {
            min[i] = solve_min(i, arr[i]);
        }

        for (int i = 0; i < 201; i++) {
            if (min[i] > max) {
                max = min[i];
            }
        }

        System.out.println(max);
    }

    private static int solve_min(int i, int i1) {
        int base_min = 1;

        if (i1 != 0) {
            base_min = i / 2 + i1 / 2 + 1;
            if (i % 2 == 1) {
                if (i1 % 2 == 1) {
                    base_min += 1;
                }
            }
        }

        return base_min;
    }
}

