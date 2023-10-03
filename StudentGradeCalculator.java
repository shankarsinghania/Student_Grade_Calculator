import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        /*
        Input: Take marks obtained (out of 100) in each subject.
        Calculate Total Marks: Sum up the marks obtained in all subjects.
        */
        int s1,s2,s3,s4,s5,total;
        double AvrPert;
        String grade="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Java marks");
        s1=sc.nextInt();
        System.out.println("Enter the C marks");
        s2=sc.nextInt();
        System.out.println("Enter the C++ marks");
        s3=sc.nextInt();
        System.out.println("Enter the Python marks");
        s4=sc.nextInt();
        System.out.println("Enter the C# marks");
        s5=sc.nextInt();

        // calculate total marks of all subject
        total=s1+s2+s3+s4+s5;
        //System.out.println(total);

        /*
        Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
        average percentage.*/
        AvrPert=total/5f;
        //System.out.println(AvrPert);

        /*
        Grade Calculation: Assign grades based on the average percentage achieved.
        */
        if(AvrPert==100){
            grade="O Grade";
        }
        else if (AvrPert>=80 && AvrPert<90){
            grade="A+ Grade";
        }else if (AvrPert>=70 && AvrPert<80){
            grade="A Grade";
        }else if (AvrPert>=60 && AvrPert<70){
            grade="B+ Grade";
        }else if (AvrPert>=50 && AvrPert<60){
            grade="B Grade";
        }else {
            grade="Fail";
        }
        /*
        Display Results: Show the total marks, average percentage, and the corresponding grade to the user
         */

        System.out.println("Total Marks : "+total);
        System.out.println("Average Percentage : "+AvrPert);
        System.out.println("Grade : "+grade);

    }
}
