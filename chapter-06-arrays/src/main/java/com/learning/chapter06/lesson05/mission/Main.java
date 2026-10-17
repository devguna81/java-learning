package com.learning.chapter06.lesson05.mission;

/**
 * [Chapter 06. 배열]
 * 05. 다차원 배열 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/457
 */

public class Main {

    public static void main(String[] args) {

        int[][] grid = new int[3][3];

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = row + col;
            }
        }

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }

    }
}
