// https://www.codetree.ai/cote/13/problems/product-code/description

import java.util.Scanner;

class Product {
	String id;
	int code;

	Product(String id, int code) {
		this.id = id;
		this.code = code;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		String id = sc.next();
		int code = sc.nextInt();

		// 2개의 객체를 생성합니다.
		Product p1 = new Product("codetree", 50);
		Product p2 = new Product(id, code);

		// 출력
		System.out.println("product " + p1.code + " is " + p1.id);
		System.out.println("product " + p2.code + " is " + p2.id);
	}
}