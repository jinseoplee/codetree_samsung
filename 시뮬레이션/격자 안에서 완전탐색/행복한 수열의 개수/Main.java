// https://www.codetree.ai/cote/13/problems/number-of-happy-sequence/description

import java.util.Scanner;

public class Main {
	static int n, m;
	static int[][] arr;
	static int[] seq;

	// 주어진 seq가 행복한 수열인지 판단하는 메서드입니다.
	static boolean isHappySequence() {
		int consecutiveCnt = 1, maxCnt = 1;
		for (int i = 1; i < n; i++) {
			if (seq[i - 1] == seq[i]) {
				consecutiveCnt++;
			} else {
				consecutiveCnt = 1;
			}

			maxCnt = Math.max(maxCnt, consecutiveCnt);
		}
		return maxCnt >= m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();
		m = sc.nextInt();

		// 변수 초기화
		arr = new int[n][n];
		seq = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int happySeqCnt = 0;

		// 가로로 행복한 수열의 수를 셉니다.
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				seq[j] = arr[i][j];
			}

			if (isHappySequence()) {
				happySeqCnt++;
			}
		}

		// 세로로 행복한 수열의 수를 셉니다.
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				seq[i] = arr[i][j];
			}

			if (isHappySequence()) {
				happySeqCnt++;
			}
		}

		// 출력
		System.out.println(happySeqCnt);
	}
}