// https://www.codetree.ai/cote/13/problems/snail-number-square-2/description

import java.util.Scanner;

public class Main {
	static int n, m;
	static int currR, currC, dir;
	static int[][] arr;

	// 남, 동, 북, 서
	static int[] dr = { 1, 0, -1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	static boolean inRange(int r, int c) {
		return 0 <= r && r < n && 0 <= c && c < m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[n][m];

		// 처음 시작 위치에 초기값을 적습니다.
		arr[currR][currC] = 1;

		// n * m 개의 숫자를 적어야 합니다.
		for (int i = 2; i <= n * m; i++) {
			int nextR = currR + dr[dir];
			int nextC = currC + dc[dir];

			// 격자를 벗어나거나 이미 방문한 경우 방향을 전환합니다.
			if (!inRange(nextR, nextC) || arr[nextR][nextC] != 0) {
				dir = (dir + 1) % 4;
			}

			currR += dr[dir];
			currC += dc[dir];
			arr[currR][currC] = i;
		}

		// 출력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}