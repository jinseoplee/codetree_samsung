// https://www.codetree.ai/cote/13/problems/get-median-2/description

import java.util.Scanner;

public class Main {
	static int n;
	static int[] arr;

	// 오름차순으로 정렬합니다.
	static void sort() {
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}

			if (i % 2 == 0) {
				// 중앙에 위치하는 값을 출력합니다.
				System.out.print(arr[i / 2] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();

		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		sort();
	}
}