/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package MyApp;
import java.util.Scanner; // To be able to get inputs
import MyLib.Student;

/**
 *
 * @author david
 */

public class main {
    
    // MAIN METHOD
    public static void main(String[] args) {
        
        // SCANNER CONSTRUCTOR
        Scanner input = new Scanner(System.in);
       
        // INPUT
        System.out.println("Enter Student Name: ");
        String name = input.nextLine();
        
        System.out.println("Enter Student Age: ");
        int age = input.nextInt();
        
        System.out.println("Enter Grade (0 - 100): ");
        double grade = input.nextDouble();
        
        // OBJECT
        Student stud1 = new Student(name, age, grade);
        
        // OUTPUT
        System.out.println("\n--- STUDENT INFORMATION ---");
        
        stud1.displayInfo(); // Calls the method in the Student.java class
    }
}
