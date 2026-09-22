package org.example;

public class DriverClass {

    public static void main(String[] args) {

        Course course1 = new Course();

        // Changing the course information using setters
        course1.setId(1);
        course1.setName("Data Structures and Algorithms");
        course1.setCode("CSC229");

        // Displaying the course information using getters
        System.out.println("Course ID: " + course1.getId());
        System.out.println("Course Name: " + course1.getName());
        System.out.println("Course Code: " + course1.getCode());

        // Creating another Course object using the overloaded constructor
        Course course2 = new Course(2, "Java Programming", "CSC211");

        System.out.println();
        System.out.println("Second Course:");
        System.out.println("Course ID: " + course2.getId());
        System.out.println("Course Name: " + course2.getName());
        System.out.println("Course Code: " + course2.getCode());
    }
}