import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[][] grid;

	// 채굴에 드는 비용을 반환합니다.
	static int getExpense(int k) {
		return k * k + (k + 1) * (k + 1);
	}

	// 주어진 k에 대하여 채굴 가능한 금의 개수를 반환합니다.
	static int getNumOfGold(int r, int c, int k) {
		int numOfGold = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (Math.abs(r - i) + Math.abs(c - j) <= k) {
					numOfGold += grid[i][j];
				}
			}
		}
		return numOfGold;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 입력
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		grid = new int[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				grid[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 격자의 각 위치가 마름모의 중앙일 때 채굴 가능한 금의 개수를 구합니다.
		int maxGold = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k <= 2 * (n - 1); k++) {
					int numOfGold = getNumOfGold(i, j, k);

					// 손해를 보지 않으면서 채굴할 수 있는 최대 금의 개수를 구합니다.
					if (m * numOfGold >= getExpense(k)) {
						maxGold = Math.max(maxGold, numOfGold);
					}
				}
			}
		}
		System.out.println(maxGold);
	}
}