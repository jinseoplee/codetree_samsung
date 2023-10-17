// https://www.codetree.ai/cote/13/problems/come-back-2/description

import java.util.Scanner;

public class Main {
	static int x, y, dir;

	// 북, 동, 남, 서
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		String dirs = sc.next();

		// flag : 시작점으로 되돌아왔는지 여부
		boolean flag = false;

		for (int i = 0; i < dirs.length(); i++) {
			char cDir = dirs.charAt(i);

			// 반시계 방향 90' 회전
			if (cDir == 'L') {
				dir = (dir + 3) % 4;
			}

			// 시계방향 90' 회전
			else if (cDir == 'R') {
				dir = (dir + 1) % 4;
			}

			// 직진
			else {
				x += dx[dir];
				y += dy[dir];
			}

			// 시작점으로 되돌아왔을 때
			if (x == 0 && y == 0) {
				System.out.println(i + 1);
				flag = true;
				break;
			}
		}

		// 시작점으로 되돌아오지 못했을 때
		if (flag == false) {
			System.out.println(-1);
		}
	}
}