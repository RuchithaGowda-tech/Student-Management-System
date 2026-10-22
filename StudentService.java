package com.student;
import  java.util.ArrayList;

public class StudentService {
	ArrayList<Student> students = new ArrayList<>();
	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Student added successfully!");
	}
	public void viewStudents() {
		if(students.isEmpty()) {
			System.out.println("No students found.");
			return;
			}
		for (Student student : students) {
			student.display();
			System.out.println("-----------------");
		}
	}
	public void searchStudent(int id) {

	    boolean found = false;

	    for (Student student : students) {

	        if (student.id == id) {

	            student.display();
	            found = true;
	            break;

	        }

	    }
	}
	    
	    public void deleteStudent(int id) {

	        boolean found = false;

	        for (int i = 0; i < students.size(); i++) {

	            if (students.get(i).id == id) {

	                students.remove(i);

	                System.out.println("Student deleted successfully!");

	                found = true;

	                break;
	            }
	        }
	            if (!found) {
	                System.out.println("Student not found.");
	            }
	        }
	      

	        public void updateStudent(int id, String newName, int newAge) {

	            boolean found = false;

	            for (Student student : students) {

	                if (student.id == id) {

	                    student.name = newName;
	                    student.age = newAge;

	                    System.out.println("Student updated successfully!");

	                    found = true;
	                    break;
	                }
	            }

	            if (!found) {
	                System.out.println("Student not found.");
	            }
	        }

	}
