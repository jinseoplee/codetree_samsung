// https://www.codetree.ai/cote/13/problems/move-in-direction/description

import java.util.Scanner;

public class Main {
	static int n, x, y;

	// 동, 서, 남, 북
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

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

			// 주어진 방향으로 dist 거리만큼 이동한 위치를 구합니다.
			x += dx[dir] * dist;
			y += dy[dir] * dist;
		}
		System.out.println(x + " " + y);
	}
}