package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class deck {

	public static void main(String[] args) throws IOException {
		Deque<Integer> deque = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		StringTokenizer st1 = new StringTokenizer(line1);
		int j = Integer.parseInt(st1.nextToken());
		int n = 0;
		int sn = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < j; i++) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			switch (st.nextToken()) {
			case "push_front":
				n = Integer.parseInt(st.nextToken());
				deque.addFirst(n);
				break;
			case "push_back":
				n = Integer.parseInt(st.nextToken());
				deque.addLast(n);
				break;

			case "pop_front":
				if (deque.isEmpty()) {
					sn = -1;
					sb.append(sn + "\n");

				} else {
					sn = deque.removeFirst();
					sb.append(sn + "\n");

				}
				break;
			case "pop_back":
				if (deque.isEmpty()) {
					sn = -1;
					sb.append(sn + "\n");

				} else {
					sn = deque.removeLast();
					sb.append(sn + "\n");

				}
				break;
			case "size":
				sn = deque.size();
				sb.append(sn + "\n");
				break;
			case "empty":
				if (deque.isEmpty()) {
					sn = 1;
					sb.append(sn + "\n");

				} else {
					sn = 0;
					sb.append(sn + "\n");
				}
				break;
			case "back":
				if (deque.isEmpty()) {
					sn = -1;
					sb.append(sn + "\n");

				} else {
					sn = deque.getLast();
					sb.append(sn + "\n");

				}
				break;
			case "front":
				if (deque.isEmpty()) {
					sn = -1;
					sb.append(sn + "\n");

				} else {
					sn = deque.getFirst();
					sb.append(sn + "\n");

				}
				break;
			}

		}
		System.out.println(sb.toString());
	}
}
