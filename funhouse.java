import java.util.*;

/*
URL to problem: https://open.kattis.com/problems/funhouse
Date Completed: 2025-08-29 21:05:24
Problem Difficulty: 2.0 (easy)
*/

public class funhouse {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int count = 1;

        while (x != 0 && y != 0) {
            System.out.println("HOUSE " + count);

            char[][] map = new char[x][y];
            String line;

            for (int i = 0; i < map[0].length; i++) {
                line = sc.next();
                for (int id = 0; id < map.length; id++) {
                    map[id][i] = line.charAt(id);
                }
            }

            map = findExit(map);
            printMap(map);

            x = sc.nextInt();
            y = sc.nextInt();

            count++;
        }
    }

    public static char[][] findExit (char[][] map) {
        char direction = 'l';

        int[] res = findEnt(map);

        int x = res[0];
        int y = res[1];

        if (y == map.length-1) {
            direction = 'u';
        } else if (x == map[0].length-1) {
            direction = 'l';
        } else if (y == 0) {
            direction = 'd';
        } else if (x == 0) {
            direction = 'r';
        }

        boolean z = true;

        while (z) {
            if (map[x][y] == 'x') {
                map[x][y] = '&';
                z = false;
            } else if (map[x][y] == '/') {
                if (direction == 'r') {
                    direction = 'u';
                } else if (direction == 'l') {
                    direction = 'd';
                } else if (direction == 'u') {
                    direction = 'r';
                } else if (direction == 'd'){
                    direction = 'l';
                }
            } else if (map[x][y] == '\\') {
                if (direction == 'r') {
                    direction = 'd';
                } else if (direction == 'l') {
                    direction = 'u';
                } else if (direction == 'u') {
                    direction = 'l';
                } else if (direction == 'd'){
                    direction = 'r';
                }
            }

            if (direction == 'l') {
                x--;
            } else if (direction == 'r') {
                x++;
            } else if (direction == 'u') {
                y--;
            } else {
                y++;
            }
        }

        return map;
    }

    public static int[] findEnt (char[][] map) {
        int[] res = new int[2];

        for (int i = 0; i < map[0].length; i++) {
            for (int id = 0; id < map.length; id++) {
                if (map[id][i] == '*') {
                    res = new int[]{id, i};
                    i = map[0].length;
                    id = map.length;
                }
            }
        }

        return res;
    }

    public static void printMap (char[][] map) {
        for (int i = 0; i < map[0].length; i++) {
            for (int id = 0; id < map.length; id++) {
                System.out.print(map[id][i]);
            }
            System.out.println("");
        }
    }
}
