// https://www.codetree.ai/cote/13/problems/korean-english-math-order/description

import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
	String name;
	int kor;
	int eng;
	int math;

	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public int compareTo(Student student) {
		if (student.kor != this.kor) {
			return student.kor - this.kor;
		}
		if (student.eng != this.eng) {
			return student.eng - this.eng;
		}
		return student.math - this.math;
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
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			students[i] = new Student(name, kor, eng, math);
		}

		// 국어, 영어, 수학 순서대로 내림차순 정렬
		Arrays.sort(students);

		// 출력
		for (int i = 0; i < n; i++) {
			Student student = students[i];
			System.out.println(student.name + " " + student.kor + " " + student.eng + " " + student.math);
		}
	}
}