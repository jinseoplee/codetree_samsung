// https://www.codetree.ai/cote/13/problems/best-place-of-33/description

import java.util.Scanner;

public class Main {
	static int n;
	static int[][] grid;

	static int getNumOfCoin(int startRow, int startCol, int endRow, int endCol) {
		int numOfCoin = 0;
		for (int row = startRow; row <= endRow; row++) {
			for (int col = startCol; col <= endCol; col++) {
				if (grid[row][col] == 1) {
					numOfCoin++;
				}
			}
		}
		return numOfCoin;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();

		grid = new int[n][n];
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				grid[row][col] = sc.nextInt();
			}
		}

		int maxCoin = 0;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				// 3 * 3 격자가 n * n 격자를 벗어나는 경우는 계산하지 않습니다.
				if (row + 2 >= n || col + 2 >= n) continue;
				// 동전의 개수를 계산합니다.
				int numOfCoin = getNumOfCoin(row, col, row + 2, col + 2);
				// 최대 동전의 개수를 저장합니다.
				maxCoin = Math.max(maxCoin, numOfCoin);
			}
		}

		// 출력
		System.out.println(maxCoin);
	}
}