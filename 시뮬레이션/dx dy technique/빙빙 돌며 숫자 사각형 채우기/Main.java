// https://www.codetree.ai/cote/13/problems/snail-number-square/description

import java.util.Scanner;

public class Main {
	static int n, m;
	static int currX = 0, currY = 0, dir = 0;;
	static int[][] arr;

	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	static boolean inRange(int x, int y) {
		return 0 <= x && x < n && 0 <= y && y < m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[n][m];

		// 처음 시작 위치에 초기값을 채웁니다.
		arr[currX][currY] = 1;

		// n * m 개의 숫자를 적어야 합니다.
		for (int i = 2; i <= n * m; i++) {
			int nextX = currX + dx[dir];
			int nextY = currY + dy[dir];

			// 격자를 벗어나거나 이미 방문한 경우 시계방향으로 90' 회전합니다.
			if (!inRange(nextX, nextY) || arr[nextX][nextY] != 0) {
				dir = (dir + 1) % 4;
			}

			currX = currX + dx[dir];
			currY = currY + dy[dir];
			arr[currX][currY] = i;
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