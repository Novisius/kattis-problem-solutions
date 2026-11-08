import java.util.*;

/*
URL to Problem: https://open.kattis.com/problems/coast
Date Completed: 2025-09-30 00:51:13
Difficulty: 2.3 (easy)
*/

public class coast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt()+2;
        int y = sc.nextInt()+2;

        char[][] map = new char[y][x];
        String line;

        for (int i = 0; i < x; i++) {
            for (int id = 0; id < y; id++) {
                map[id][i] = '0';
            }
        }

        sc.nextLine();

        for (int i = 1; i < x-1; i++) {
            line = sc.nextLine();
            for (int id = 1; id < y-1; id++) {
                map[id][i] = line.charAt(id-1);
            }
        }

        int count = 0;

        flood(map, 0, 0);

        for (int i = 0; i < x; i++) {
            for (int id = 0; id < y; id++) {
                if (map[id][i] == '1') {
                    if (map[id+1][i] == 'x') {
                        count++;
                    }
                    if (map[id-1][i] == 'x') {
                        count++;
                    }
                    if (map[id][i+1] == 'x') {
                        count++;
                    }
                    if (map[id][i-1] == 'x') {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

    private static void flood(char[][] map, int i, int i1) {
        if (map[i][i1] == '0') {
            map[i][i1] = 'x';
            if (i < map.length-1) {
                flood(map, i+1, i1);
            }
            if (i > 0) {
                flood(map, i - 1, i1);
            }
            if (i1 < map[0].length-1) {
                flood(map, i, i1+1);
            }
            if (i1 > 0) {
                flood(map, i, i1 - 1);
            }
        }
    }
}
