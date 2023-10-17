// https://www.codetree.ai/cote/13/problems/comfortable-state-on-the-grid/description

import java.util.Scanner;

public class Main {
	static final int DIR_NUM = 4;

	static int n, m;
	static boolean[][] arr;

	// 동, 남, 서, 북
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };

	static boolean inRange(int r, int c) {
		return 1 <= r && r <= n && 1 <= c && c <= n;
	}

	// 인접한 4개의 칸 중 색칠되어 있는 칸의 개수를 구합니다.
	static int adjacentCnt(int r, int c) {
		int cnt = 0;
		for (int dir = 0; dir < DIR_NUM; dir++) {
			int nextR = r + dr[dir];
			int nextC = c + dc[dir];
			if (inRange(nextR, nextC) && arr[nextR][nextC]) {
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();
		m = sc.nextInt();

		arr = new boolean[n + 1][n + 1];

		while (m-- > 0) {
			int r = sc.nextInt();
			int c = sc.nextInt();

			// 해당 칸을 색칠합니다.
			arr[r][c] = true;

			// 정확히 3개의 칸이 색칠되어 있는 경우
			if (adjacentCnt(r, c) == 3) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}