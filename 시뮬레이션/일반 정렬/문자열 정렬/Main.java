// https://www.codetree.ai/cote/13/problems/string-sort/description

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		String str = sc.next();

		// 사전 순으로 정렬
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		String sortedStr = new String(chars);
		System.out.println(sortedStr);
	}
}