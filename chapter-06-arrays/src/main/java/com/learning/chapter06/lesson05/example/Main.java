package com.learning.chapter06.lesson05.example;

/**
 * [Chapter 06. 배열]
 * 05. 다차원 배열 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/457
 */

public class Main {

    public static void main(String[] args) {

        int[][] grid = {
            {1, 1, 1},
            {0, 2, 0},
            {1, 1, 1}
        };

        System.out.println("grid[1][1]: " + grid[1][1]);

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }

    }
}
