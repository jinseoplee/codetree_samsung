// https://www.codetree.ai/cote/13/problems/tromino/description

import java.util.Scanner;

public class Main {
	static int n, m;
	static int[][] grid;

	// 가능한 모든 모양을 전부 적어줍니다.
	static int[][][] shapes = { 
			{ { 1, 0, 0 }, 
			  { 1, 1, 0 }, 
			  { 0, 0, 0 } }, 
			
			{ { 0, 1, 0 }, 
			  { 1, 1, 0 }, 
			  { 0, 0, 0 } },
			
			{ { 1, 1, 0 }, 
			  { 1, 0, 0 }, 
			  { 0, 0, 0 } }, 
			
			{ { 1, 1, 0 }, 
			  { 0, 1, 0 }, 
			  { 0, 0, 0 } },
			
			{ { 1, 1, 1 }, 
			  { 0, 0, 0 }, 
			  { 0, 0, 0 } }, 
			
			{ { 1, 0, 0 }, 
			  { 1, 0, 0 }, 
			  { 1, 0, 0 } } 
	};

	// 주어진 위치에 대하여 가능한 모든 모양을 탐색하며 최대 합을 반환합니다.
	static int getMaxSum(int x, int y) {
		int maxSum = 0;

		for (int i = 0; i < 6; i++) {
			boolean isPossible = true;
			int sum = 0;
			for (int dx = 0; dx < 3; dx++) {
				for (int dy = 0; dy < 3; dy++) {
					if (shapes[i][dx][dy] == 0) continue;
					if (x + dx >= n || y + dy >= m) isPossible = false;
					else sum += grid[x + dx][y + dy];
				}
			}
			if (isPossible) {
				maxSum = Math.max(maxSum, sum);
			}
		}

		return maxSum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();
		m = sc.nextInt();

		// 초기화
		grid = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				grid[i][j] = sc.nextInt();
			}
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ans = Math.max(ans, getMaxSum(i, j));
			}
		}

		// 출력
		System.out.println(ans);
	}
}