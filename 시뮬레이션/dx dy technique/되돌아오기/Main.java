// https://www.codetree.ai/cote/13/problems/come-back/description

import java.util.Scanner;

public class Main {
	static int n, x, y;

	// 동, 서, 남, 북
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static int ans = -1;
	static int elapsedTime;

	static boolean move(int dir, int dist) {
		while (dist-- > 0) {
			x += dx[dir];
			y += dy[dir];
			elapsedTime++;
			// 시작 위치로 다시 돌아오면 답을 갱신합니다.
			if (x == 0 && y == 0) {
				ans = elapsedTime;
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();

		while (n-- > 0) {
			char cDir = sc.next().charAt(0);
			int dist = sc.nextInt();

			int dir;
			if (cDir == 'E') {
				dir = 0;
			} else if (cDir == 'W') {
				dir = 1;
			} else if (cDir == 'S') {
				dir = 2;
			} else {
				dir = 3;
			}

			boolean done = move(dir, dist);

			// 시작 위치에 돌아오게 된다면 종료합니다.
			if (done) {
				break;
			}
		}

		// 출력
		System.out.println(ans);
	}
}