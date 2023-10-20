// https://www.codetree.ai/cote/13/problems/indices-of-sorted-array/description

import java.util.Arrays;
import java.util.Scanner;

class Number implements Comparable<Number> {
	int index;
	int num;

	Number(int index, int number) {
		this.index = index;
		this.num = number;
	}

	@Override
	public int compareTo(Number number) {
		// num을 오름차순으로 정렬합니다.
		if (this.num != number.num) {
			return this.num - number.num;
		}
		// num이 같다면 인덱스를 오름차순으로 정렬합니다.
		return this.index - number.index;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		int n = sc.nextInt();

		// 변수 초기화
		int[] answer = new int[n];
		Number[] numbers = new Number[n];

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			numbers[i] = new Number(i, num);
		}

		Arrays.sort(numbers);

		for (int i = 0; i < n; i++) {
			answer[numbers[i].index] = i + 1;
		}

		// 출력
		for (int i = 0; i < n; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}