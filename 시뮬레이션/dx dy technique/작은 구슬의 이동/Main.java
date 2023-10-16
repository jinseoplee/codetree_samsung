// https://www.codetree.ai/cote/13/problems/small-marble-movement/description

import java.util.Scanner;

public class Main {
	static final int ASCII_NUM = 128;

	static int n, t;
	static int r, c, dir;
	static int[] mapper = new int[ASCII_NUM];

	static int[] dr = { 0, 1, -1, 0 };
	static int[] dc = { 1, 0, 0, -1 };

	static boolean inRange(int r, int c) {
		return 1 <= r && r <= n && 1 <= c && c <= n;
	}

	static void simulate() {
		while (t-- > 0) {
			int nr = r + dr[dir];
			int nc = c + dc[dir];
			// 범위 안에 들어온다면 해당 방향으로 한 칸 움직입니다.
			if (inRange(nr, nc)) {
				r = nr;
				c = nc;
			}
			// 벽에 부딪히면 방향을 반대로 뒤집습니다.
			else {
				dir = 3 - dir;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();
		t = sc.nextInt();

		// 각 알파벳 별 방향 번호를 설정합니다.
		mapper['R'] = 0;
		mapper['D'] = 1;
		mapper['U'] = 2;
		mapper['L'] = 3;

		r = sc.nextInt();
		c = sc.nextInt();
		char cDir = sc.next().charAt(0);
		dir = mapper[cDir];

		simulate();

		// 출력
		System.out.println(r + " " + c);
	}
}