import java.util.*;
public class LetterGrade
{
    public static void main(String[]args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = console.next();
        double avg = calculateAvg();
        System.out.printf("My name is %s\nAverage: %-6.2f\n",name,avg);
        printLetter(avg);
    }
    public static double calculateAvg()
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 3 Scores");
        double total = 0;
        for(int i = 1; i <= 3; i++)
        {
            System.out.println("Enter a value");
            double val = console.nextDouble();
            total = total + val;
        }
        double avg = total/3;
        return avg;
    }
    public static void printLetter(double grade) 
    {
        System.out.print("Your grade is ");
        if (grade <= 100 && grade >= 90) 
        {
        System.out.print("A");
        } 
            else if (grade < 90 && grade >= 80) 
            {
            System.out.print("B");
            } 
                else if (grade < 80 && grade >= 70) 
                {
                System.out.print("C");
                } 
                    else if (grade < 70 && grade >= 60) 
                    {
                    System.out.print("D");
                    } 
                        else if (grade < 60) 
                        {
                        System.out.print("F");
                        }
    }
}