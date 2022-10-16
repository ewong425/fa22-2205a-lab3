package LE3Q2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class DriverForStudentClass {
    public static void main(String[] args) {
        Student me = new Student("Ethan", "Wong", 100.0);
        header(me, 3,2);
        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(me);
        stuList.add(new Student("Harry", "Potter", 75.5));
        stuList.add(new Student("Ronald", "Weasley", 86.0));
        stuList.add(new Student("Hermione", "Granger", 91.7));
        stuList.add(new Student("Parvati", "Patil", 93.75));
        System.out.println("The Score Card: ");
        for(int i=0; i<stuList.size(); i++) {
            System.out.println(stuList.get(i));
        }
        System.out.println("\nThe sorted list in terms of score in descending order...");
        Collections.sort(stuList);
        for(int i=0; i<stuList.size(); i++) {
            System.out.println(stuList.get(i).toString());
        }
        System.out.println("\nThe sorted list in terms of Last Names...");
        HelperClassCompareLastNames lastNames = new HelperClassCompareLastNames();
        Collections.sort(stuList, lastNames);
        for(int i=0; i<stuList.size(); i++) {
            System.out.println(stuList.get(i));
        }
        System.out.println("\nThe sorted list in terms of First Names...");
        HelperClassCompareFirstNames firstNames = new HelperClassCompareFirstNames();
        Collections.sort(stuList, firstNames);
        for(int i=0; i<stuList.size(); i++) {
            System.out.println(stuList.get(i));
        }
        footer(3,2);
    }
    public static void header(Student myInfo, int labE_number, int q_number) {
        System.out.println("=============================================");
        System.out.println("Lab Exercise: " + labE_number + "-Q" + q_number);
        System.out.println("Prepared by: Ethan Wong");
        System.out.println("Student Number: 251205049");
        System.out.println("Goal: To work with the Collections, Comparator, and Comparable classes with Student");
        System.out.println("=============================================\n");
    }
    public static void footer(int labE_number, int q_number) {
        System.out.println("\n=============================================");
        System.out.println("Completion of Lab Exercise " + labE_number + "-Q" + q_number + " is successful!");
        System.out.println("Signing off -Ethan ");
        System.out.println("=============================================");
    }
}
