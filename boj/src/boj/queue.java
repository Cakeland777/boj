package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class queue {

	public static void main(String[] args) throws IOException {
		Queue<Integer> queue = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		StringTokenizer ss1 = new StringTokenizer(line1);
		int j = Integer.parseInt(ss1.nextToken());

		int n = 0;
		int st = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < j; i++) {
			String line = br.readLine();
			StringTokenizer ss = new StringTokenizer(line);
			switch (ss.nextToken()) {
			case "push":
				n = Integer.parseInt(ss.nextToken());
				queue.offer(n);
				break;
			case "pop":
				if (queue.isEmpty()) {
					st = -1;
					sb.append(st + "\n");
				} else {
					st = queue.poll();
					sb.append(st + "\n");
				}
				break;
			case "size":
				st = queue.size();
				sb.append(st + "\n");
				break;
			case "empty":
				if (queue.isEmpty()) {
					st = 1;
					sb.append(st + "\n");
				} else {
					st = 0;
					sb.append(st + "\n");
				}
				break;
			case "front":
				if (queue.isEmpty()) {
					st = -1;
					sb.append(st + "\n");
				} else {
					st = queue.peek();
					sb.append(st + "\n");
				}
				break;

			case "back":
				if (queue.isEmpty()) {
					st = -1;
					sb.append(st + "\n");
				} else {
					st = n;
					sb.append(st + "\n");
				}
				break;

			}

		}
		System.out.println(sb.toString());
	}

}
