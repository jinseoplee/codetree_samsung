// https://www.codetree.ai/cote/13/problems/distance-from-origin/description

import java.util.Arrays;
import java.util.Scanner;

class Point implements Comparable<Point> {
	int no;
	int dist;

	Point(int no, int dist) {
		this.no = no;
		this.dist = dist;
	}

	@Override
	public int compareTo(Point point) {
		// 거리가 가까운 점부터 순서대로 정렬합니다.
		if (this.dist != point.dist) {
			return this.dist - point.dist;
		}
		// 거리가 같으면 번호가 작은 점부터 정렬합니다.
		return this.no - point.no;
	}
}

public class Main {
	static int n;
	static Point[] points;

	// 원점과 (x, y) 사이의 거리를 구합니다.
	static int getDistFromOrigin(int x, int y) {
		return Math.abs(x) + Math.abs(y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();

		points = new Point[n];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			points[i] = new Point(i + 1, getDistFromOrigin(x, y));
		}

		Arrays.sort(points);

		// 출력
		for (int i = 0; i < n; i++) {
			System.out.println(points[i].no);
		}
	}
}