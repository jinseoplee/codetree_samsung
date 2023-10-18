// https://www.codetree.ai/cote/13/problems/shoot-a-laser-in-the-mirror-2/description

import java.util.Scanner;

public class Main {
	static int n;
	static int startNum;
	static char[][] arr;

	static int x, y, dir;

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, -1, 0, 1 };

	// 주어진 숫자에 따라 시작 위치와 방향을 구합니다.
	static void initialize(int num) {
		if (num <= n) {
			x = 0;
			y = num - 1;
			dir = 0;
		} else if (num <= 2 * n) {
			x = num - n - 1;
			y = n - 1;
			dir = 1;
		} else if (num <= 3 * n) {
			x = n - 1;
			y = n - (num - 2 * n);
			dir = 2;
		} else {
			x = n - (num - 3 * n);
			y = 0;
			dir = 3;
		}
	}

	static boolean inRange(int x, int y) {
		return 0 <= x && x < n && 0 <= y && y < n;
	}

	static void move(int nextDir) {
		x += dx[nextDir];
		y += dy[nextDir];
		dir = nextDir;
	}

	static int simulate() {
		int moveCnt = 0;
		while (inRange(x, y)) {
			// 0 <-> 1 / 2 <-> 3
			if (arr[x][y] == '/') {
				move(dir ^ 1);
			}
			// 0 <-> 3 / 1 <-> 2
			else {
				move(3 - dir);
			}
			moveCnt++;
		}
		return moveCnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();

		arr = new char[n][n];
		for (int i = 0; i < n; i++) {
			String input = sc.next();
			for (int j = 0; j < n; j++) {
				arr[i][j] = input.charAt(j);
			}
		}

		startNum = sc.nextInt();

		// 시작 위치와 방향을 구합니다.
		initialize(startNum);
		// 시뮬레이션 시작
		int moveCnt = simulate();
		// 출력
		System.out.println(moveCnt);
	}
}