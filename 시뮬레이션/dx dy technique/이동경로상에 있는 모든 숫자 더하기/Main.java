// https://www.codetree.ai/cote/13/problems/add-all-the-numbers-on-the-path/description

import java.util.Scanner;

public class Main {
	static int n, t;
	static int currR, currC, dir;
	static int ans;
	static String dirs;
	static int[][] arr;

	// 북, 동, 남, 서
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	static boolean inRange(int r, int c) {
		return 0 <= r && r < n && 0 <= c && c < n;
	}

	static void simulate() {
		for (int i = 0; i < t; i++) {
			char cDir = dirs.charAt(i);

			// 왼쪽으로 90도 방향 전환
			if (cDir == 'L') {
				dir = (dir + 3) % 4;
			}
			// 오른쪽으로 90도 방향 전환
			else if (cDir == 'R') {
				dir = (dir + 1) % 4;
			}
			// 직진
			else {
				int nextR = currR + dr[dir];
				int nextC = currC + dc[dir];
				if (inRange(nextR, nextC)) {
					currR = nextR;
					currC = nextC;
					// 해당 칸에 적혀있는 수를 더합니다.
					ans += arr[currR][currC];
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();
		t = sc.nextInt();
		dirs = sc.next();

		arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// 초기 시작 위치를 설정합니다.
		currR = currC = n / 2;

		ans = arr[currR][currC];

		simulate();

		// 출력
		System.out.println(ans);
	}
}