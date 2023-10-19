// https://www.codetree.ai/cote/13/problems/007/description

import java.util.Scanner;

class Spy {
	String secretCode;
	char meetingPoint;
	int time;

	Spy(String secretCode, char meetingPoint, int time) {
		this.secretCode = secretCode;
		this.meetingPoint = meetingPoint;
		this.time = time;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		String secretCode = sc.next();
		char meetingPoint = sc.next().charAt(0);
		int time = sc.nextInt();

		Spy node = new Spy(secretCode, meetingPoint, time);

		// 출력
		System.out.println("secret code : " + node.secretCode);
		System.out.println("meeting point : " + node.meetingPoint);
		System.out.println("time : " + node.time);
	}
}