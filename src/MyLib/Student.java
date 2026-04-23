/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author david
 */
public class Student {
    
    // CLASS VARIABLES
    String name;
    int age;
    double grade;
    
    // CONSTRUCTOR
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    // METHOD
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        
        // CONDITION (REMARKS)
        if (grade >= 75 && grade <= 100) { // For students who got a PASSING grade
            System.out.println("Remarks: PASSED");
        }
        else if (grade >= 0 && grade < 75) { // For students who got a FAILED grade
            System.out.println("Remarks: FAILED");
        }
        else {
            System.out.println("ERROR: Grade must be between 0 - 100");
        }
    }
}
