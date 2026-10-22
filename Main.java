package com.student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        int choice;

        do {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Students");
            System.out.println("4. Delete Students");
            System.out.println("5. Update Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Age: ");
                    int age = sc.nextInt();

                    Student student = new Student(id, name, age);

                    service.addStudent(student);

                    break;

                case 2:

                    service.viewStudents();

                    break;
                    
                case 3:
                	System.out.println("Enter Student ID to Search:");
                	int searchid =sc.nextInt();
                	service.searchStudent(searchid);
                	break;
                	
                case 4:

                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    service.deleteStudent(deleteId);

                    break;
                   
                case 5:

                    System.out.print("Enter Student ID to Update: ");
                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Student Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Student Age: ");
                    int newAge = sc.nextInt();

                    service.updateStudent(updateId, newName, newAge);

                    break;

                case 6:

                    System.out.println("Thank you!");

                    break;

                default:

                    System.out.println("Invalid choice!");

            }

        } while (choice != 6);

        sc.close();

    }

}