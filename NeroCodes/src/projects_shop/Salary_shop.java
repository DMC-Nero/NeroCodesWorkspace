package projects_shop;
import java.util.*;
public class Salary_shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 30 numbers
        System.out.println("Enter 30 numbers:");

        // Initialize sum to zero
        int sum1 = 0;

        // Loop to take 30 inputs and calculate the sum
        for (int i = 1; i <= 35; i++) {
            System.out.print("Enter day " + i + ": ");
            
            // Check if the input is an integer
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                System.out.print("Enter day " + i + ": ");
                scanner.next(); // Consume the invalid input
            }

            // Add the valid input to the sum
            sum1 += scanner.nextInt();
        }

        // Display the sum
        System.out.println("The sum of the entered numbers is: " + sum1);

        // Prompt the user to enter 30 numbers
        System.out.println("Enter 30 numbers:");

        // Initialize sum to zero
        int sum2 = 0;

        // Loop to take 30 inputs and calculate the sum
        for (int j = 1; j <= 35; j++) {
            System.out.print("Enter day " + j + ": ");
            
            // Check if the input is an integer
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                System.out.print("Enter day " + j + ": ");
                scanner.next(); // Consume the invalid input
            }

            // Add the valid input to the sum
            sum2 += scanner.nextInt();
        }

        // Display the sum
        System.out.println("The sum of the entered numbers is: " + sum2);
        int lol=sum1-sum2;
        System.out.println("total ot earned "+lol);
        
        System.out.println("enter the salary: ");
        Scanner sc=new Scanner(System.in);
        int xd=sc.nextInt();
        System.out.println("enter the number of days present ");
        int dayspresent=sc.nextInt();
        System.out.println("enter the working hours ");
        int workinghours=sc.nextInt();
        int a,b,c,d,e,f;
        a=xd /30;         //salary_per_day
        b=a/workinghours;       		//salary_per_hour
        c=a*dayspresent;  //salary_presnt_days
        d=lol/60; 			//ot_in_hours
        e=d*b;				//salary_for_ot
        f=e+c;
        System.out.println("salary for salesman: "+ f);
        
        scanner.close();
        sc.close();

}
}
