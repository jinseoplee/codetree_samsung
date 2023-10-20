// https://www.codetree.ai/cote/13/problems/kth-special-string/description

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final int MAX_N = 100;

	static int n, k;
	static int cnt;
	static String t;
	static String[] words = new String[MAX_N];

	static boolean startWith(String a, String b) {
		// b의 길이가 더 길 수 없습니다.
		if (b.length() > a.length()) {
			return false;
		}

		// a가 b로 시작하는지 확인합니다.
		for (int i = 0; i < b.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();
		k = sc.nextInt();
		t = sc.next();

		for (int i = 0; i < n; i++) {
			String word = sc.next();

			// 문자열 t로 시작하는 경우에만 목록에 넣어줍니다.
			if (startWith(word, t)) {
				words[cnt++] = word;
			}
		}

		// 사전순으로 정렬합니다.
		Arrays.sort(words, 0, cnt);

		System.out.println(words[k - 1]);
	}
}