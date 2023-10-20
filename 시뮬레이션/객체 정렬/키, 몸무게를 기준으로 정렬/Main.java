// https://www.codetree.ai/cote/13/problems/sort-by-height-and-weight/description

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
		// 키를 기준으로 오름차순 정렬
		if (this.height != person.height) {
			return this.height - person.height;
		}
		// 키가 동일한 경우에는 몸무게를 기준으로 내림차순 정렬
		return person.weight - this.weight;
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

		Arrays.sort(people);

		for (int i = 0; i < n; i++) {
			Person person = people[i];
			System.out.println(person.name + " " + person.height + " " + person.weight);
		}
	}
}