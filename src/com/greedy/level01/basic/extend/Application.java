package com.greedy.level01.basic.extend;

import java.util.Scanner;

public class Application {
public static void main(String[] args) {
		
		Student[] students = new Student[3];

		students[0] = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
		students[1] = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
		students[2] = new Student("강개순", 23, 167.0, 45, 4, "정보통신공학과");

		/* 향상된 for문 사용 */
		for (Student student : students) {
			System.out.println(student.getInformation());
		}

		Scanner sc = new Scanner(System.in);

		Employee[] employees = new Employee[10];
		int count = 0;

		while (true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("키 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.nextLine();

			employees[count++] = new Employee(name, age, height, weight, salary, dept);

			System.out.print("계속 입력하시겠습니까? (y/n) : ");
			char anwser = sc.nextLine().charAt(0);

			if (anwser == 'n') {
				break;
			}
		}

		/* NullPointerException 발생하지 않도록 count 까지만 출력 */
		for (int i = 0; i < count; i++) {
			System.out.println(employees[i].getInformation());
		}

		/* 향상된 for문으로 출력한다면 */
		for (Employee employee : employees) {
			if (employee == null) {
				break;
			}
			System.out.println(employee.getInformation());
		}
	}
}
