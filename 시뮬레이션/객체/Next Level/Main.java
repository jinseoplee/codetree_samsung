// https://www.codetree.ai/cote/13/problems/next-level/description

import java.util.Scanner;

class User {
	String id;
	int lv;

	User() {
		this.id = "";
		this.lv = 0;
	}

	User(String id, int lv) {
		this.id = id;
		this.lv = lv;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 첫 번째 User 객체를 생성합니다.
		User user1 = new User();

		// 값을 변경합니다.
		user1.id = "codetree";
		user1.lv = 10;

		// 입력
		String id = sc.next();
		int lv = sc.nextInt();

		// 두 번째 User 객체를 생성합니다.
		User user2 = new User();

		// 값을 변경합니다.
		user2.id = id;
		user2.lv = lv;

		// 출력
		System.out.println("user " + user1.id + " lv " + user1.lv);
		System.out.println("user " + user2.id + " lv " + user2.lv);
	}
}