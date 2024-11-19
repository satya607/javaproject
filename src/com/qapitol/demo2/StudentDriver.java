package com.qapitol.demo2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDriver {
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	ArrayList studentList = new ArrayList();
	ArrayList teacherList = new ArrayList();
	int input;
	do {
		System.out.println("Option Menu");
		System.out.println("1.add Student Detail");
		System.out.println("2.add Teacher Detail");
		System.out.println("3.Exit");
		input=sc.nextInt();
		switch(input) {
		case 1:
			Student student = new Student();
			System.out.println("Enter student id");
			int studentid = sc.nextInt();
			System.out.println("Enter student name");
			String studentname = sc.next();
			System.out.println("Enter student age");
			int Studentage = sc.nextInt();
			System.out.println("Enter course");
			String course = sc.next();
			System.out.println("Enter marks");
			int marks = sc.nextInt();
			student.setId(studentid);
			student.setName(studentname);
			student.setAge(Studentage);
			student.setCourse(course);
			student.setMarks(marks);
			studentList.add(student); 
			student.calculate(marks);
			break;
		case 2:
			System.out.println("Enter teacher id");
			int id = sc.nextInt();
			System.out.println("Enter teacher name");
			String name = sc.next();
			System.out.println("Enter teacher age");
			int age = sc.nextInt();
			System.out.println("Enter subject");
			String subject = sc.next();
			System.out.println("Enter salary");
			int salary = sc.nextInt();
			Teacher teacher = new Teacher();
			teacher.setId(id);
			teacher.setName(name);
			teacher.setAge(age);
			teacher.setSubjectteacher(subject);
			teacher.setSalary(salary);
			teacher.displayDetails();
			break;
		case 3:
			System.out.println("exit the program");
			break;
		}
		
	
}
	while(input!=3);
}}
