package org.example;

// This class represents a course
public class Course {

    // Data members
    private int id;
    private String name;
    private String code;

    // Default constructor
    public Course() {
        id = 0;
        name = "";
        code = "";
    }

    // Overloaded constructor
    public Course(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for code
    public void setCode(String code) {
        this.code = code;
    }

    // Getter for code
    public String getCode() {
        return code;
    }
}