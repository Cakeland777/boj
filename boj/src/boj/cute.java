package boj;

import java.util.Scanner;

public class cute {
	public static void main(String[] args) {
		int Cute = 0;
		int nCute = 0;
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			int k = sc.nextInt();
			if (k == 1) {
				Cute += 1;
			} else {
				nCute += 1;
			}

		}
		if (Cute > nCute) {
			System.out.println("Junhee is cute!");

		} else {
			System.out.println("Junhee is not cute!");
		}

	}

}