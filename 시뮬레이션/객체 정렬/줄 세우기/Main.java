// https://www.codetree.ai/cote/13/problems/line-up-students/description

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
		// 키가 더 큰 학생이 앞에 와야 합니다.
		if (student.height != this.height) {
			return student.height - this.height;
		}
		// 몸무게가 더 큰 학생이 앞에 와야 합니다.
		if (student.weight != this.weight) {
			return student.weight - this.weight;
		}
		// 번호가 작은 학생이 앞에 와야 합니다.
		return this.no - student.no;
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