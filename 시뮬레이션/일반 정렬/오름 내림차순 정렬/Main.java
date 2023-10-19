// https://www.codetree.ai/cote/13/problems/inc-dec-sorting/description

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		int n = sc.nextInt();

		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		// 오름차순 정렬
		Arrays.sort(nums);
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();

		// 내림차순 정렬
		Integer[] nums2 = Arrays.stream(nums).boxed().toArray(Integer[]::new);
		Arrays.sort(nums2, Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			System.out.print(nums2[i] + " ");
		}
		System.out.println();
	}
}