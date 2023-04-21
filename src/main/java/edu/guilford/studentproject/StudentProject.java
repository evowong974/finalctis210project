/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.guilford.studentproject;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ewong
 */
public class StudentProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Instantiation of Student object
//        Student theStudent = new Student("Ada Lovelace");
//        System.out.println("The student name is " + theStudent.getStudentName());
//
//        theStudent.setStudentName("Grace Hopper");
//        System.out.println("The new student name is " + theStudent.getStudentName()
//                + "\n" + "Total Credits: " + String.format("%.2f", theStudent.calcTotalCredits()));
//
//        theStudent.setStudentName("Ada Lovelace");
//        System.out.println("Student Name: " + theStudent.getStudentName());
//
//        String guilfordFormat;
//        theStudent.setGuilfordCredits(88.50);
//        guilfordFormat = String.format("%.2f", theStudent.getGuilfordCredits());
//        System.out.println("Guilford Credits: " + guilfordFormat);
//
//        String transferFormat;
//        theStudent.setTransferCredits(12.00);
//        transferFormat = String.format("%.2f", theStudent.getTransferCredits());
//        System.out.println("Transfer Credits: " + transferFormat);
//
//        Student theOtherStudent = new Student("Grace Hopper");
////        String otherguilfordFormat;
//        theOtherStudent.setGuilfordCredits(25.00);
////        guilfordFormat = String.format("%.2f", theOtherStudent.getGuilfordCredits());
////        System.out.println("Guilford Credits: " + guilfordFormat);  
////        String othertransferFormat;
//        theOtherStudent.setTransferCredits(0.00);
////        transferFormat = String.format("%.2f", OtherStudent.getTransferCredits());
////        System.out.println("Transfer Credits: " + transferFormat);  
////        String examFormat;
//        theOtherStudent.setExamCredits(4.50);
////        examFormat = String.format("%.2f", OtherStudent.getExamCredits());
////        System.out.println("Exam Credits: " + examFormat);     
//        theOtherStudent.setStudyAway(false);
////        System.out.println("Study Away: " + theOtherStudent.getStudyAway());    
//        System.out.println("The other student " + "\n" + theOtherStudent.toString());
//
//        Student thethirdStudent = new Student("Alan Turing");
//        thethirdStudent.setStudentID(314159);
//        thethirdStudent.setGuilfordCredits(30.00);
//        thethirdStudent.setTransferCredits(12.50);
//        thethirdStudent.setExamCredits(0.00);
//        thethirdStudent.setStudyAway(false);
//        // System.out.println("Study Away: " + thethirdStudent.getStudyAway());
//        thethirdStudent.setStudentAthlete(false);
//        thethirdStudent.setInSeason(false);
//        thethirdStudent.setAthleticTeam("None");
//        thethirdStudent.setStudentGpa(3.85);
//        thethirdStudent.setStudentDisability(false);
//        thethirdStudent.setGraduationYear(2026);
//        thethirdStudent.setEarlyCollege(true);
//        System.out.println("The third student " + "\n" + thethirdStudent.toString());
//
//        theStudent.setStudentID(141415);
//
//        theOtherStudent.setStudentID(773771);
//
//        System.out.println("Testing the toString method"
//                + "\n" + theStudent.toString() + "\n"
//                + theOtherStudent.toString() + "\n" + thethirdStudent.toString());
//        System.out.println("Before changing attribute" + "\n"
//                + theStudent.toGuilfordCreditString());
//
//        theStudent.setGuilfordCredits(95.50);
//        System.out.println("After changing attribute"
//                + "\n" + theStudent.toGuilfordCreditString());
//
//        System.out.println("Calculating grade points" + "\n"
//                + "Student Name: " + thethirdStudent.getStudentName() + "\n"
//                + String.format("%.2f", thethirdStudent.calculateGradePoints()));
//
//        //Challenge "G" String format with all upper case names
//        System.out.println("Challenge G String for Students"
//                + "\n" + theStudent.toChallengeString() + "\n"
//                + theOtherStudent.toChallengeString() + "\n" + thethirdStudent.toChallengeString());
//
//        //Challenge Switch Student Name to Lastname, Firstname
//        System.out.println("Challenge Student Name Format to Lastname, Firstname " + "\n"
//                + "Student Name:  " + theStudent.getStudentName() + "\n" + "New Name: "
//                + theStudent.challengeSwitchName() + "\n"
//                + "Student Name:  " + theOtherStudent.getStudentName() + "\n" + "New Name: "
//                + theOtherStudent.challengeSwitchName() + "\n"
//                + "Student Name:  " + thethirdStudent.getStudentName() + "\n" + "New Name: "
//                + thethirdStudent.challengeSwitchName());
//
//        // Sending the analyzeGuilfordCredits message to the Student objects
//        System.out.println("Checking number of Guilford credits " + "\n" + "Student Name: " + "\t"
//                + theStudent.getStudentName() + "\n" + "High Guilford Credits: "
//                + "\t" + theStudent.analyzeGuilfordCredits());
//
//        System.out.println("Student Name: " + "\t" + theOtherStudent.getStudentName()
//                + "\n" + "High Guilford Credits: " + "\t" + theOtherStudent.analyzeGuilfordCredits());
//
//        System.out.println("Student Name: " + "\t" + thethirdStudent.getStudentName()
//                + "\n" + "High Guilford Credits: " + "\t" + thethirdStudent.analyzeGuilfordCredits());
//
//        System.out.println("Checking number of Guilford credits and is an athlete " + "\n" + "Student Name: " + "\t"
//                + theStudent.getStudentName() + "\n" + "High Guilford Credits and athlete: "
//                + "\t" + theStudent.analyzeGuilfordCreditsAthlete());
//
//        System.out.println("Student Name: " + "\t"
//                + theOtherStudent.getStudentName() + "\n" + "High Guilford Credits and athlete: "
//                + "\t" + theOtherStudent.analyzeGuilfordCreditsAthlete());
//
//        System.out.println("Student Name: " + "\t"
//                + thethirdStudent.getStudentName() + "\n" + "High Guilford Credits and athlete: "
//                + "\t" + thethirdStudent.analyzeGuilfordCreditsAthlete());
//
//        // Sending the analyzeGPAStudyAway message to the Student objects
//        System.out.println("Checking GPA or studying away " + "\n" + "Student Name: " + "\t"
//                + theStudent.getStudentName() + "\n" + "High GPA or studying away: "
//                + "\t" + theStudent.analyzeGPAStudyAway());
//
//        System.out.println("Student Name: " + "\t" + theOtherStudent.getStudentName()
//                + "\n" + "High GPA or studying away: " + "\t" + theOtherStudent.analyzeGPAStudyAway());
//
//        System.out.println("Student Name: " + "\t" + thethirdStudent.getStudentName()
//                + "\n" + "High GPA or studying away: " + "\t" + thethirdStudent.analyzeGPAStudyAway());
//
//        // Using conditional statements to calculate the number of each 
//        // Student object that is assigned
//        System.out.println("Calculating total points " + "\n" + "Student Name: " + "\t"
//                + theStudent.getStudentName() + "\n" + "Total points: "
//                + "\t" + theStudent.calculatePoints());
//
//        System.out.println("Student Name: " + "\t"
//                + theOtherStudent.getStudentName() + "\n" + "Total points: "
//                + "\t" + theOtherStudent.calculatePoints());
//
//        System.out.println("Student Name: " + "\t"
//                + thethirdStudent.getStudentName() + "\n" + "Total points: "
//                + "\t" + thethirdStudent.calculatePoints());

        // Lab 11 
        Student Student1 = new Student("Drake Schreiber", 56337843, 112.00, 0, 0, false, true, false,
                "Guilford Men's Tennis ", 3.66, false, 2023, false);

        Student Student2 = new Student("Emanuelle Oye ", 45666321, 18, 1, 9, false,
                true, true, "Guilford Men's Tennis ", 3.36, false, 2026, false);

        Student Student3 = new Student("Harris Khan", 87945773, 0, 72, 0, true, false,
                false, "None ", 4.0, false, 2021, false);

        Student Student4 = new Student("Ethan Frye", 32477788, 120, 53, 10,
                false, false, false, "None", 3.12, false, 2023, false);

        Student Student5 = new Student("Joshua Jones ", 11811141, 112, 20, 0,
                false, false, false, "None", 3.8, false, 2023, false);

        Student Student6 = new Student("Tyson Wolter ", 34332156, 107, 9, 0,
                false, false, false, "None", 3.2, false, 2023, false);

        Student Student7 = new Student("Larry McMillan ", 56478298, 112, 20, 0, false, false,
                false, "None", 3.8, false, 2023, false);

        Student Student8 = new Student("Maleah Hean ", 78654307, 64, 10, 4,
                false, false, false, "None", 3.2, true, 2025, false);

        System.out.println("\n" + "Added Eight Student Data" + "\n"
                + "Student 1" + "\n" + Student1.toString() + "\n" + "\n"
                + "Student 2" + "\n" + Student2.toString() + "\n" + "\n"
                + "Student 3" + "\n" + Student3.toString() + "\n" + "\n"
                + "Student 4" + "\n" + Student4.toString() + "\n" + "\n"
                + "Student 5" + "\n" + Student5.toString() + "\n" + "\n"
                + "Student 6" + "\n" + Student6.toString() + "\n" + "\n"
                + "Student 7" + "\n" + Student7.toString() + "\n" + "\n"
                + "Student 8" + "\n" + Student8.toString());

        System.out.println("\n" + "Student ID" + "\t" + "Points "
                + "\n" + Student1.toGString() + "\t" + Student1.calculatePoints()
                + "\n" + Student2.toGString() + "\t" + Student2.calculatePoints()
                + "\n" + Student3.toGString() + "\t" + Student3.calculatePoints()
                + "\n" + Student4.toGString() + "\t" + Student4.calculatePoints()
                + "\n" + Student5.toGString() + "\t" + Student5.calculatePoints()
                + "\n" + Student6.toGString() + "\t" + Student6.calculatePoints()
                + "\n" + Student7.toGString() + "\t" + Student7.calculatePoints()
                + "\n" + Student8.toGString() + "\t" + Student8.calculatePoints());

        JFrame infoWindow = new JFrame("Enter New Student Evaluation");
        infoWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(Student1);
        students.add(Student2);
        students.add(Student3);
        students.add(Student4);
        students.add(Student5);
        students.add(Student6);
        students.add(Student7);
        students.add(Student8);

        CreateStudentEvaluation infoPanel = new CreateStudentEvaluation(students);
        infoWindow.add(infoPanel);

        infoWindow.pack();
        infoWindow.setVisible(true);

    }
}
