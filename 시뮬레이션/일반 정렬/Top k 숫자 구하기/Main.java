// https://www.codetree.ai/cote/13/problems/kth-number/description

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] nums = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			nums[i] = sc.nextInt();
		}

		// 오름차순 정렬
		Arrays.sort(nums);

		// k번째 숫자를 출력합니다.
		System.out.println(nums[k]);
	}
}