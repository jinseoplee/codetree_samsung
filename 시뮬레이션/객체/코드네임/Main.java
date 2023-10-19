// https://www.codetree.ai/cote/13/problems/code-name/description

import java.util.Scanner;

class User {
	char codeName;
	int score;

	User(char codeName, int score) {
		this.codeName = codeName;
		this.score = score;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		User[] users = new User[5];
		for (int i = 0; i < 5; i++) {
			char codeName = sc.next().charAt(0);
			int score = sc.nextInt();
			users[i] = new User(codeName, score);
		}

		// 가장 낮은 점수를 갖는 요원을 찾습니다.
		int minIdx = 0;
		for (int i = 1; i < 5; i++) {
			if (users[minIdx].score > users[i].score) {
				minIdx = i;
			}
		}

		// 출력
		System.out.println(users[minIdx].codeName + " " + users[minIdx].score);
	}
}