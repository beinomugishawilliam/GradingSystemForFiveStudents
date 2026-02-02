
package myfirstproject.studentgradingsystemfivestudents;

import java.util.Scanner;

public class StudentGradingSystemFiveStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays to store grade counts (grades 1-9)
        int[] gradeCount = new int[10]; // index 0 won't be used, using indices 1-9
        int studentCount = 0;
        
        System.out.println("===== STUDENT GRADING SYSTEM =====");
        System.out.println("Enter scores for 5 students (0-100)\n");
        
        // Process 5 students using a while loop
        while (studentCount < 5) {
            System.out.print("Enter score for student " + (studentCount + 1) + ": ");
            int score = scanner.nextInt();
            
            // Validate input
            if (score < 0 || score > 100) {
                System.out.println("Invalid score! Please enter a score between 0 and 100.");
                continue;
            }
            
            String grade;
            String remark;
            
            // Determine grade and remark using if-else-if statements
            if (score >= 80 && score <= 100) {
                grade = "1";
                remark = "D1";
                gradeCount[1]++;
            } else if (score >= 75 && score <= 79) {
                grade = "2";
                remark = "D2";
                gradeCount[2]++;
            } else if (score >= 66 && score <= 74) {
                grade = "3";
                remark = "C3";
                gradeCount[3]++;
            } else if (score >= 60 && score <= 65) {
                grade = "4";
                remark = "C4";
                gradeCount[4]++;
            } else if (score >= 50 && score <= 59) {
                grade = "5";
                remark = "C5";
                gradeCount[5]++;
            } else if (score >= 45 && score <= 49) {
                grade = "6";
                remark = "C6";
                gradeCount[6]++;
            } else if (score >= 35 && score <= 44) {
                grade = "7";
                remark = "P7";
                gradeCount[7]++;
            } else if (score >= 30 && score <= 34) {
                grade = "8";
                remark = "P8";
                gradeCount[8]++;
            } else {
                grade = "9";
                remark = "F";
                gradeCount[9]++;
            }
            
            // Display individual student results
            System.out.println("  Student " + (studentCount + 1) + ": Score = " + score + 
                             ", Grade = " + grade + ", Remark = " + remark);
            System.out.println();
            
            studentCount++;
        }
        
        // Display summary
        System.out.println("\n===== GRADE DISTRIBUTION SUMMARY =====");
        System.out.println("Grade\tCount\tRemark");
        System.out.println("-----\t-----\t------");
        
        // Display counts for grades 1-9
        for (int i = 1; i <= 9; i++) {
            String remark = "";
            switch(i) {
                case 1: remark = "D1"; break;
                case 2: remark = "D2"; break;
                case 3: remark = "C3"; break;
                case 4: remark = "C4"; break;
                case 5: remark = "C5"; break;
                case 6: remark = "C6"; break;
                case 7: remark = "P7"; break;
                case 8: remark = "P8"; break;
                case 9: remark = "F"; break;
            }
            System.out.println(i + "\t" + gradeCount[i] + "\t" + remark);
        }
        
        System.out.println("=======================================");
        System.out.println("Total students processed: 5");
        
        scanner.close();
    }
}
