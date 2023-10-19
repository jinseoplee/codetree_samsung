// https://www.codetree.ai/cote/13/problems/snail-alphabet-square/description

import java.util.Scanner;

public class Main {
	static int n, m;
	static int currR, currC, dir;
	static char[][] arr;

	// 동, 남, 서, 북
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };

	static boolean inRange(int r, int c) {
		return 0 <= r && r < n && 0 <= c && c < m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();
		m = sc.nextInt();

		arr = new char[n][m];
		arr[currR][currC] = 'A';

		// n * m 개의 알파벳을 적어야 합니다.
		for (int i = 1; i < n * m; i++) {
			int nextR = currR + dr[dir];
			int nextC = currC + dc[dir];

			// 범위를 벗어나거나 이미 방문한 경우 시계방향으로 90' 회전합니다.
			if (!inRange(nextR, nextC) || arr[nextR][nextC] != '\0') {
				dir = (dir + 1) % 4;
			}

			currR += dr[dir];
			currC += dc[dir];
			arr[currR][currC] = (char) ('A' + i % 26);
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