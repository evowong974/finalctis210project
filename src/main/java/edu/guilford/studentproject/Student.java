/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.guilford.studentproject;

import java.awt.List;

/**
 *
 * @author ewong
 */
public class Student {

    private String studentName;
    private int studentID;
    private double guilfordCredits;
    private double transferCredits;
    private double examCredits;
    private boolean studyAway;
    private boolean studentAthlete;
    private boolean inSeason;
    private String athleticTeam;
    private double studentGpa;
    private boolean studentDisability;
    private int graduationYear;
    private boolean earlyCollege;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    private String emailAddress;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getGuilfordCredits() {
        return guilfordCredits;
    }

    public void setGuilfordCredits(double guilfordCredits) {
        this.guilfordCredits = guilfordCredits;
    }

    public double getTransferCredits() {
        return transferCredits;
    }

    public void setTransferCredits(double transferCredits) {
        this.transferCredits = transferCredits;
    }

    public Student(String studentName, int studentID, double guilfordCredits, double transferCredits) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.guilfordCredits = guilfordCredits;
        this.transferCredits = transferCredits;
    }

    public Student(double examCredits, boolean studyAway) {
        this.examCredits = examCredits;
        this.studyAway = studyAway;
    }

    public double getExamCredits() {
        return examCredits;
    }

    public void setExamCredits(double examCredits) {
        this.examCredits = examCredits;
    }

    public boolean getStudyAway() {
        return studyAway;
    }

    public void setStudyAway(boolean studyAway) {
        this.studyAway = studyAway;
    }

    public Student(String studentName, int studentID, double guilfordCredits, double transferCredits, double examCredits, boolean studyAway) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.guilfordCredits = guilfordCredits;
        this.transferCredits = transferCredits;
        this.examCredits = examCredits;
        this.studyAway = studyAway;
    }

    public boolean getStudentAthlete() {
        return studentAthlete;
    }

    public void setStudentAthlete(boolean studentAthlete) {
        this.studentAthlete = studentAthlete;
    }

    public boolean getInSeason() {
        return inSeason;
    }

    public void setInSeason(boolean inSeason) {
        this.inSeason = inSeason;
    }

    public String getAthleticTeam() {
        return athleticTeam;
    }

    public void setAthleticTeam(String athleticTeam) {
        this.athleticTeam = athleticTeam;
    }

    public double getStudentGpa() {
        return studentGpa;
    }

    public void setStudentGpa(double studentGpa) {
        this.studentGpa = studentGpa;
    }

    public boolean getStudentDisability() {
        return studentDisability;
    }

    public void setStudentDisability(boolean studentDisability) {
        this.studentDisability = studentDisability;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public boolean getEarlyCollege() {
        return earlyCollege;
    }

    public void setEarlyCollege(boolean earlyCollege) {
        this.earlyCollege = earlyCollege;

    }

    public Student(String studentName, int studentID, double guilfordCredits, double transferCredits, double examCredits, boolean studyAway, boolean studentAthlete, boolean inSeason, String athleticTeam, double studentGpa, boolean studentDisability, int graduationYear, boolean earlyCollege) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.guilfordCredits = guilfordCredits;
        this.transferCredits = transferCredits;
        this.examCredits = examCredits;
        this.studyAway = studyAway;
        this.studentAthlete = studentAthlete;
        this.inSeason = inSeason;
        this.athleticTeam = athleticTeam;
        this.studentGpa = studentGpa;
        this.studentDisability = studentDisability;
        this.graduationYear = graduationYear;
        this.earlyCollege = earlyCollege;

    }

    public double calcTotalCredits() {
        double totalCredits = guilfordCredits + transferCredits + examCredits;
        return totalCredits;

    }

    public double calculateGradePoints() {
        double gradePoints = guilfordCredits * studentGpa;
        return gradePoints;
    }

    public String toString() {
        String output;

        output
                = "Guilford Student Name: " + studentName + "\n"
                + "Student ID: " + getStudentID() + "\n"
                + "Guilford Student Credits: " + String.format("%.2f", guilfordCredits) + "\n"
                + "Transfer Credits: " + String.format("%.2f", transferCredits) + "\n"
                + "Exam Credits: " + String.format("%.2f", examCredits) + "\n"
                + "Study Away: " + studyAway + "\n"
                + "Athlete: " + studentAthlete + "\n"
                + "Sport: " + athleticTeam + "\n"
                + "GPA: " + String.format("%.2f", studentGpa) + "\n"
                + "Disability: " + studentDisability + "\n"
                + "Early College: " + earlyCollege + "\n"
                + "Graduation Year: " + graduationYear + "\n"
                + "Total Credits: " + String.format("%.2f", calcTotalCredits());
        return output;
    }

    //Final Lab extending of to string
    public String toSubmitString() {
        String output;

        output
                = "\n" + "\n" + "Student Name: " + studentName + "\n" + "\n"
                + "Student ID: " + "G" + String.format("%08d", getStudentID()) + "\n" + "\n"
                + "Guilford Credits: " + String.format("%.2f", guilfordCredits) + "\n" + "\n"
                + "Transfer Credits: " + String.format("%.2f", transferCredits) + "\n" + "\n"
                + "Exam Credits: " + String.format("%.2f", examCredits) + "\n" + "\n"
                + "Study Away: " + studyAway + "\n" + "\n"
                + "Athlete: " + studentAthlete + "\n" + "\n"
                + "Sport: " + athleticTeam + "\n" + "\n"
                + "GPA: " + String.format("%.2f", studentGpa) + "\n" + "\n"
                + "Disability: " + studentDisability + "\n" + "\n"
                + "Early College: " + earlyCollege + "\n" + "\n"
                + "Graduation Year: " + graduationYear + "\n" + "\n"
                + "Total Credits: " + String.format("%.2f", calcTotalCredits()) + "\n" + "\n";
        return output;
    }
    //Challenge Student Name, Student Id, and "G", in upper case.

    public String toChallengeString() {
        String output;
        output
                = getStudentName().toUpperCase()
                + " G" + String.format("%08d", getStudentID());
        return output;
    }

    public String toGString() {
        String output;
        output
                = " G" + String.format("%08d", getStudentID());
        return output;
    }

    public String challengeSwitchName() {
        String firstname = getStudentName().substring(0, getStudentName().indexOf(" "));
        String lastname = getStudentName().substring(getStudentName().indexOf(" ") + 1);
        return lastname + ", " + firstname;

    }

    public String toGuilfordCreditString() {
        String output;
        output
                = "Student Name: " + getStudentName() + "\n"
                + "Guilford Credits: " + String.format("%.2f", getGuilfordCredits());
        return output;

    }

    // Lab 9
    // Stating whether the number of Guilford credits the student has greater than SS 
    public boolean analyzeGuilfordCredits() {
        boolean highCredits;
        highCredits = guilfordCredits > 80;
        return highCredits;
    }
    // Evaluating whether the student has completed more Guilford credits and is an athlete

    public boolean analyzeGuilfordCreditsAthlete() {
        boolean highCreditsAthlete;
        highCreditsAthlete = (guilfordCredits > 88) & (studentAthlete);
        return highCreditsAthlete;
    }
    // Evaluate whether the overall GPA is greater than 3.5 or the student is on a study away
    // program

    public boolean analyzeGPAStudyAway() {
        boolean highGPAstudyaway;
        highGPAstudyaway = (studentGpa > 3.5) || (studyAway == true);
        return highGPAstudyaway;
    }

//    public double calculatePoints() {
//        double totalCredits = calcTotalCredits();
//        double totalPoints = 0;
//        if (totalCredits >= 88) {
//            totalPoints = totalPoints + 4;
//        } else if (totalCredits >= 56) {
//            totalPoints = totalPoints + 3;
//        } else if (totalCredits >= 25) {
//            totalPoints = totalPoints + 2;
//        } else if (totalCredits <= 24) {
//            totalPoints = totalPoints + 1;
//        }
//        if (studyAway) {
//            totalPoints = totalPoints + 5;
//        }
//        return totalPoints;
//    }
    public double calculatePoints() {
        double totalCredits = calcTotalCredits();
        double totalPoints = 0;
        double currentYear = 2023;
        if (graduationYear >= 2023) {
            totalPoints = totalPoints - graduationYear + currentYear + 5;
        }
        if (earlyCollege) {
            totalPoints = totalPoints + 1;
        }
        if (studentDisability) {
            totalPoints = totalPoints + 3;
        }
        if (studentAthlete && totalCredits >= 56) {
            totalPoints = totalPoints + 2;
        }
        if (studyAway) {
            totalPoints = totalPoints + 5;
        }
        if (totalCredits >= 100) {
            totalPoints = totalPoints + 5;
        } else if (totalCredits >= 80) {
            totalPoints = totalPoints + 4;
        } else if (totalCredits >= 60) {
            totalPoints = totalPoints + 3;
        } else if (totalCredits >= 40) {
            totalPoints = totalPoints + 2;
        } else if (totalCredits >= 20) {
            totalPoints = totalPoints + 1;
        }
        return totalPoints;
    }

    public String toFinalString() {
        String theString;
        theString = "<html>Name: " + studentName
                + "<br>StudentID: " + studentID
                + "<br>Guilford Credits: " + guilfordCredits
                + "<br>Transfer Credits: " + transferCredits
                + "<br>Exam Credits: " + examCredits
                + "<br>Study Away: " + studyAway
                + "<br>Student Athlete: " + studentAthlete
                + "<br>In Season: " + inSeason
                + "<br>Athletic Team: " + athleticTeam
                + "<br>Student GPA: " + studentGpa
                + "<br>Graduation Year: " + graduationYear
                + "<br>Early College: " + earlyCollege;

        return theString;
// Rules for assigning points:
// Points assigned for Graduation year is based on (NEGATIVE Expected Graduation Year) Plus (Current Year) + 5. Early College [EC] only gains 1pt
// If a student has a disability, they are assigned 3 points automatically. Otherwise, they receive no additional points. [Relevant Student Data]
// If the student is studying abroad, or came from a study abroad program outside of Guilford, they automatically get the maximum number of points.
// Determine if a student is an active student athlete. If they are, then they gain  1 point. Then, if the student has completed  56 credits or more, They are given 2 additional points. [Another piece of data]
// Each Student is rewarded points based off of the amount of credit/credit hours that student earned either in school, or transferred in with, with 20 credits per point, up to a maximum of 5 points. [Multiple Points]
    }
}
