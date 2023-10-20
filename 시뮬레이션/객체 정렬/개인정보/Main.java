// https://www.codetree.ai/cote/13/problems/personal-info/description

import java.util.Arrays;
import java.util.Scanner;

class Person {
	String name;
	int height;
	double weight;

	Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
}

public class Main {
	static final int PERSON_NUM = 5;

	static Person[] people = new Person[PERSON_NUM];

	// 정렬한 결과값을 출력합니다.
	static void print(String str) {
		System.out.println(str);
		for (int i = 0; i < PERSON_NUM; i++) {
			Person person = people[i];
			System.out.println(person.name + " " + person.height + " " + person.weight);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 5명의 이름, 키, 몸무게를 입력받습니다.
		for (int i = 0; i < PERSON_NUM; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			people[i] = new Person(name, height, weight);
		}

		// 이름순으로 정렬
		Arrays.sort(people, (p1, p2) -> p1.name.compareTo(p2.name));
		print("name");

		// 키가 큰 순으로 정렬
		Arrays.sort(people, (p1, p2) -> p2.height - p1.height);
		print("height");
	}
}