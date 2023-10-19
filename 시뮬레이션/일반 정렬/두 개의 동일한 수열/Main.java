// https://www.codetree.ai/cote/13/problems/two-equal-series/description

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n;
	static int[] arr1, arr2;

	static boolean eqaul() {
		for (int i = 0; i < n; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();

		arr1 = new int[n];
		arr2 = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}

		// 오름차순 정렬
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// 수열이 일치하는지 확인합니다.
		if (eqaul()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}