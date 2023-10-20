// https://www.codetree.ai/cote/13/problems/compare-total-points/description

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

	// 세 점수의 합이 오름차순이 되도록 정렬합니다.
	@Override
	public int compareTo(Student student) {
		return (this.kor + this.eng + this.math) - (student.kor + student.eng + student.math);
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

		Arrays.sort(students);

		// 출력
		for (int i = 0; i < n; i++) {
			Student student = students[i];
			System.out.println(student.name + " " + student.kor + " " + student.eng + " " + student.math);
		}
	}
}