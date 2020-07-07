package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] coordinates = {
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5},
                {5, 6},
                {6, 7}
        };
        System.out.println(checkStraightLine(coordinates));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        int y1;
        int x1;
        int y2;
        int x2;
        double gradient = 0;
        double c = 0;
        if (coordinates.length > 2) {
            for (int i = 0; i < coordinates.length; i++) {
                x1 = coordinates[i][0];
                y1 = coordinates[i][1];
                if (i == 0) {
                    y2 = coordinates[1][1];
                    x2 = coordinates[1][0];
                    if (x2 - x1 == 0) {
                        gradient = 0;
                    } else {
                        gradient = (y2 - y1) / (x2 - x1);
                    }
                    c = y1 - (gradient * x1);
                } else {
                    if (c != (y1 - (gradient * x1))) {
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
