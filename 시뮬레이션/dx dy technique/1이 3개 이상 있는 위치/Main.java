// https://www.codetree.ai/cote/13/problems/place-more-than-3-ones/description

import java.util.Scanner;

public class Main {
	static int n;
	static int[][] grid;
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	static boolean inRange(int x, int y) {
		return 0 <= x && x < n && 0 <= y && y < n;
	}

	static int adjacentCnt(int x, int y) {
		int cnt = 0;
		for (int dir = 0; dir < 4; dir++) {
			int nx = x + dx[dir];
			int ny = y + dy[dir];
			if (inRange(nx, ny) && grid[nx][ny] == 1) {
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();

		grid = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = sc.nextInt();
			}
		}

		// 각 칸을 탐색합니다.
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (adjacentCnt(i, j) >= 3) {
					ans++;
				}
			}
		}

		// 출력
		System.out.println(ans);
	}
}