// https://www.codetree.ai/cote/13/problems/determine-same-word/description

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		char[] str1 = sc.next().toCharArray();
		char[] str2 = sc.next().toCharArray();

		// 각 문자를 정렬합니다.
		Arrays.sort(str1);
		String sortedStr1 = new String(str1);

		Arrays.sort(str2);
		String sortedStr2 = new String(str2);

		// 출력
		if (sortedStr1.equals(sortedStr2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}