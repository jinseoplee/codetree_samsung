// https://www.codetree.ai/cote/13/problems/sorting-words/description

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		int n = sc.nextInt();
		String[] words = new String[n];
		for (int i = 0; i < n; i++) {
			words[i] = sc.next();
		}

		// 사전 순으로 정렬
		Arrays.sort(words);

		for (int i = 0; i < n; i++) {
			System.out.println(words[i]);
		}
	}
}