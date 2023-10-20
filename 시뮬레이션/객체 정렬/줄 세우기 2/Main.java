// https://www.codetree.ai/cote/13/problems/line-up-students-2/description

import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
	int no;
	int height;
	int weight;

	Student(int no, int height, int weight) {
		this.no = no;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Student student) {
		// 키를 오름차순으로 정렬합니다.
		if (this.height != student.height) {
			return this.height - student.height;
		}
		// 키가 동일한 경우 몸무게를 내림차순으로 정렬합니다.
		return student.weight - this.weight;
	}
}

public class Main {
	static int n;
	static Student[] students;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		n = sc.nextInt();

		students = new Student[n];
		for (int i = 0; i < n; i++) {
			int height = sc.nextInt();
			int weight = sc.nextInt();
			students[i] = new Student(i + 1, height, weight);
		}

		Arrays.sort(students);

		// 출력
		for (int i = 0; i < n; i++) {
			Student student = students[i];
			System.out.println(student.height + " " + student.weight + " " + student.no);
		}
	}
}