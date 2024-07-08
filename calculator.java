import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student grade calculator");
        System.out.println("enter no. of subjects");
        int nS=scanner.nextInt();
        int total=0;
        for(int i=0;i<nS;i++)
        {
            System.out.println("enter marks obtained in "+(i+1)+"i ");
            int marks=scanner.nextInt();
            total+=marks;
        }
        double averagem=(double)total/nS;
        char Grade;
        if (averagem >= 90) {
            Grade = 'A';
        } else if (averagem >= 80) {
            Grade = 'B';
        } else if (averagem>= 70) {
            Grade = 'C';
        } else if (averagem >= 60) {
            Grade = 'D';
        } else {
            Grade = 'F';
        }
        System.out.println("Your average is: " + averagem);
    System.out.println("Your letter grade is: " + Grade);

        scanner.close();
    }
}