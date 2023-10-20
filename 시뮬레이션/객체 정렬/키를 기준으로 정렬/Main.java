// https://www.codetree.ai/cote/13/problems/sort-by-height/description

import java.util.Arrays;
import java.util.Scanner;

class Person implements Comparable<Person> {
	String name;
	int height;
	int weight;

	Person(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Person person) {
		return this.height - person.height;
	}
}

public class Main {
	static int n;
	static Person[] people;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();
		people = new Person[n];

		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			int weight = sc.nextInt();
			people[i] = new Person(name, height, weight);
		}

		// 키를 기준으로 오름차순 정렬
		Arrays.sort(people);

		// 출력
		for (int i = 0; i < n; i++) {
			Person person = people[i];
			System.out.println(person.name + " " + person.height + " " + person.weight);
		}
	}
}