package boj;

import java.util.Arrays;
import java.util.Scanner;

public class Music {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] asc = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] desc = { 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] c = new int[8];
		for (int i = 0; i < 8; i++) {
			c[i] = sc.nextInt();
		}

		if (Arrays.equals(asc, c)) {
			System.out.println("ascending");
		} else if (Arrays.equals(desc, c)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}