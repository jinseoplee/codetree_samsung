// https://www.codetree.ai/cote/13/problems/bomb-removal/description

import java.util.Scanner;

class Bomb {
	String code;
	char color;
	int second;

	Bomb(String code, char color, int second) {
		this.code = code;
		this.color = color;
		this.second = second;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		String code = sc.next();
		char color = sc.next().charAt(0);
		int second = sc.nextInt();

		// 객체 생성
		Bomb bomb = new Bomb(code, color, second);

		// 출력
		System.out.println("code : " + bomb.code);
		System.out.println("color : " + bomb.color);
		System.out.println("second : " + bomb.second);
	}
}