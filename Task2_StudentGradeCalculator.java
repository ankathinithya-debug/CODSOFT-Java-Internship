import java.util.Scanner;
public class Task2_StudentGradeCalculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String[] subjects = {"Hindi", "English", "Maths", "Science", "Social"};
int total = 0;
for (String s : subjects) {
int marks;
 do {
System.out.print("Enter marks for " + s + ": ");
marks = sc.nextInt();
if (marks < 0 || marks > 100) {
System.out.println("Enter marks between 0 and 100 only.");
}
} while (marks < 0 || marks > 100);
 total += marks;
}
double percentage = total / 5.0;
System.out.println("\nTotal Marks = " + total);
System.out.println("Percentage = " + percentage + "%");
if (percentage >= 90)
System.out.println("Grade: A+");
else if (percentage >= 80)
System.out.println("Grade: A");
else if (percentage >= 70)
System.out.println("Grade: B+");
else if (percentage >= 60)
System.out.println("Grade: B");
else if (percentage >= 50)
System.out.println("Grade: C");
else
System.out.println("Grade: F");
sc.close();
    }
}
