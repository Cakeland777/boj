package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class stack {

	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack<>();
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
			case "push":
				n = Integer.parseInt(st.nextToken());
				stack.push(n);
				break;
			case "pop":
				if (stack.empty()) {
					sn = -1;
					sb.append(sn + "\n");

				} else {
					sn = stack.pop();
					sb.append(sn + "\n");

				}
				break;
			case "size":
				sn = stack.size();
				sb.append(sn + "\n");
				break;
			case "empty":
				if (stack.empty()) {
					sn = 1;
					sb.append(sn + "\n");

				} else {
					sn = 0;
					sb.append(sn + "\n");
				}
				break;
			case "top":
				if (stack.empty()) {
					sn = -1;
					sb.append(sn + "\n");

				} else {
					sn = stack.peek();
					sb.append(sn + "\n");

				}
				break;
			}

		}
		System.out.println(sb.toString());
	}
}
