// https://www.codetree.ai/cote/13/problems/snail-start-from-center/description

import java.util.Scanner;

public class Main {
	static int n;
	static int currX, currY, dir;
	static int[][] arr;

	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { 1, 0, -1, 0 };

	static boolean inRange(int x, int y) {
		return 0 <= x && x < n && 0 <= y && y < n;
	}

	static void move(int x, int y) {
		currX += dx[dir];
		currY += dy[dir];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();
		arr = new int[n][n];

		// 시작 위치를 구합니다.
		currX = currY = n / 2;

		int num = 1, moveNum = 1;
		while (inRange(currX, currY)) {
			for (int i = 0; i < moveNum; i++) {
				arr[currX][currY] = num++;
				move(currX, currY);
			}

			// 방향을 바꿉니다.
			dir = (dir + 1) % 4;

			// 현재 방향이 왼쪽이거나 오른쪽인 경우 해당 방향으로 움직여야 할 횟수를 1 증가시킵니다.
			if (dir == 0 || dir == 2) {
				moveNum++;
			}
		}

		// 출력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}