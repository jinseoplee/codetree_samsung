// https://www.codetree.ai/cote/13/problems/where-live/description

import java.util.Scanner;

class Person {
	String name;
	String addr;
	String city;

	Person(String name, String addr, String city) {
		this.name = name;
		this.addr = addr;
		this.city = city;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		int n = sc.nextInt();

		Person[] people = new Person[n];

		for (int i = 0; i < n; i++) {
			String name = sc.next();
			String addr = sc.next();
			String park = sc.next();
			people[i] = new Person(name, addr, park);
		}

		// 사전순으로 이름이 가장 느린 사람 찾기
		int lastIdx = 0;
		for (int i = 1; i < n; i++) {
			if (people[i].name.compareTo(people[lastIdx].name) > 0) {
				lastIdx = i;
			}
		}

		// 출력
		System.out.println("name " + people[lastIdx].name);
		System.out.println("addr " + people[lastIdx].addr);
		System.out.println("city " + people[lastIdx].city);
	}
}