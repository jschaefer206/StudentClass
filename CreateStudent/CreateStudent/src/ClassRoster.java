// Jonathan Schaefer
// Bellevue University
// Assignment 6.1
// 7/18/2018
//Source: https://stackoverflow.com/questions/21266547/for-loop-to-print-the-integer-array-in-reverse

import java.util.LinkedList;

public class ClassRoster {

	public static void main(String[] args) {
		
		Student s = new Student("Jonathan", "Schaefer", 1);
		Student s1 = new Student("John", "Campbell", 2);
		Student s2 = new Student("Kyle", "Wherry", 3);
		Student s3 = new Student("Brandon", "Socks", 4);
		Student s4 = new Student("Billy", "The Kid", 5);
		Student s5 = new Student("Joe", "Rogen", 6);
		Student s6 = new Student("Josh", "Berry", 7);
		Student s7 = new Student("Jennifer", "Storfa", 8);
		Student s8 = new Student("Kelly", "Wells", 9);
		Student s9 = new Student("Jessica", "Jones", 10);
		Student s10 = new Student("Kelly", "Price", 11);
		Student s11 = new Student("Patrick", "Page", 12);
		Student s12 = new Student("Spencer", "Graff", 13);
		Student s13 = new Student("Sir", "Mix a Lot", 14);
		Student s14 = new Student("Betty", "White", 15);
		Student s15 = new Student("Rock", "Paper", 16);
		Student s16 = new Student("Christina", "Black", 17);
		Student s17 = new Student("Master", "Chief", 18);
		Student s18 = new Student("Georgia", "Peach", 19);
		Student s19 = new Student("Maria", "Gonzalez", 20);
		Student s20 = new Student("Maria", "Gonzalez", 21);
		Student s21 = new Student("Maria", "Gonzalez", 22);
		
		
		LinkedList<Student> Student = new LinkedList<Student>();
		
		Student.add(s);
		Student.add(s1);
		Student.add(s2);
		Student.add(s3);
		Student.add(s4);
		Student.add(s5);
		Student.add(s6);
		Student.add(s7);
		Student.add(s8);
		Student.add(s9);
		Student.add(s10);
		Student.add(s11);
		Student.add(s12);
		Student.add(s13);
		Student.add(s14);
		Student.add(s15);
		Student.add(s16);
		Student.add(s17);
		Student.add(s18);
		Student.add(s19);
		Student.add(s20);
		Student.add(s20);
		
		
		
		for (Student i: Student)
		{
			System.out.println("Student: " + i.getFirstName() + " " + i.getLastName() + " " + i.getStudentID());
		}
		
		System.out.println("");
		
		for (int i = Student.size() - 1; i >= 0; i--)
		{
			System.out.println("Student: " + Student.get(i).getFirstName() + " " + Student.get(i).getLastName() + " " + Student.get(i).getStudentID());
		}

	}

}
