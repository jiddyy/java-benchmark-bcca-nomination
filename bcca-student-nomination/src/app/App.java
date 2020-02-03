package app;

import java.util.*;
import java.io.*;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Teacher newTeacher = getTeacherInfo();
        Student newStudent = getStudentInfo();
        input.close();
        saveNomineeInfo(newTeacher, newStudent);
    }

    private static void saveNomineeInfo(Teacher newTeacher, Student newStudent) {
        try {
            FileOutputStream fileStream = new FileOutputStream("saveNomineeInfo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(newTeacher);
            os.writeObject(newStudent);
            System.out.println("Saved student application.");
            os.close();
        } catch (IOException ex) {
            System.out.println("Failed to save nominee information.");
        }
    }

    public static Teacher getTeacherInfo() {
        System.out.println(
                "Thank you for taking the time to nominate a student to Base Camp! Please fill out this small form.");
        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("What is your email? ");
        String email = input.nextLine();
        System.out.println("What is your school district? ");
        String schoolDistrict = input.nextLine();
        System.out.println("What is your position? ");
        String position = input.nextLine();
        System.out.println("What is your relationship to the nominee? ");
        String relationshipToNominee = input.nextLine();
        return new Teacher(name, email, schoolDistrict, position, relationshipToNominee);
    }

    public static Student getStudentInfo() {
        System.out.println("Enough about you, please tell us about the student.");
        System.out.println("What is his/her name? ");
        String name = input.nextLine();
        System.out.println("How old are they? ");
        Integer age = input.nextInt();
        System.out.println("How can we contact them? (email/phone) ");
        String contactInfo = input.nextLine();
        System.out.println("What is their graduation date? ");
        String gradDate = input.nextLine();

        System.out.println(
                "Base Camp Coding Academy looks for students with the aptitude and dedication to succeed in this program. Please explain why you believe this student will make an excellent candidate:");
        System.out.println(
                "Aptitude: Do you have any experiences when this student has demonstrated a strong ability to think logically and/or strategically? ");
        String aptitude = input.nextLine();
        System.out.println(
                "Perseverance: Is there any evidence of the applicant being engaged in something they are passionate about? ");
        String perseverance = input.nextLine();
        System.out.println(
                "Dedication: Do you think the applicant would be able to reliably attend the program five days a week in Water Valley? ");
        String dedication = input.nextLine();
        System.out.println("Work Ethic / Heart: Why does this student deserve a position at Base Camp? ");
        String workEthic = input.nextLine();
        System.out.println("Anything else you'd like to share about this nominee?");
        System.out.println(
                "Please include any information you'd like to share about the nominee. We will handle this information candidly and anything you share will only be used to the benefit of the nominee. ");
        String anythingElse = input.nextLine();
        System.out.println("Thank you so much for nominating this student to Base Camp!");
        return new Student(name, age, contactInfo, gradDate, aptitude, perseverance, dedication, workEthic,
                anythingElse);
    }
}