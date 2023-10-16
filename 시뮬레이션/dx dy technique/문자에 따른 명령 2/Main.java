// https://www.codetree.ai/cote/13/problems/text-based-commands2/description

import java.util.Scanner;

public class Main {
	static String dirs;
	static int x, y, currDir;
	// 북, 동, 남, 서
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		dirs = sc.next();

		for (int i = 0; i < dirs.length(); i++) {
			char cDir = dirs.charAt(i);

			// 반시계 방향 90' 회전
			if (cDir == 'L') {
				currDir = (currDir - 1 + 4) % 4;
			}
			// 시계방향 90' 회전
			else if (cDir == 'R') {
				currDir = (currDir + 1) % 4;
			}
			// 직진
			else {
				x += dx[currDir];
				y += dy[currDir];
			}
		}

		// 출력
		System.out.println(x + " " + y);
	}
}