package array;

import java.util.Scanner;

public class MultiDimArray {

	public static void main(String[] args) {
		int[][] nums = new int[3][3];
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter teh values for rows nd cols");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				nums[i][j] = scn.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println("");
		}

		int twoDArray[][] = { { 0, 1, 2 }, { 1, 2, 3 }, { 2, 3, 4 } };

		for (int[] a : twoDArray) {
			for (int b : a) {
				System.out.print(b);
			}
			System.out.println();
		}
	}

}
