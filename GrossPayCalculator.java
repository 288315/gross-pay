import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {

        String name, status;
        double rate, basicPay, overtimePay, grossPay;
        int hours, overtime;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter employees name: ");
        name = scan.nextLine();

        System.out.print("Press F for Full Time or P for Part Time: ");
        status = scan.nextLine();
        
        if (status.equalsIgnoreCase("F")) {

            System.out.println("------ Full Time Employee ------");

            System.out.print("Enter Basic Pay: ");
            basicPay = scan.nextDouble();
            
            System.out.println("________________________________");
            System.out.println("Employee Name:   " + name);
            System.out.println("Basic Pay:       " + basicPay);
            System.out.println("________________________________");
            System.out.println("Gross Pay:       " + basicPay);

        } 
        else if (status.equalsIgnoreCase("P")) {

            System.out.println("------ Part Time Employee ------");

            System.out.print("Enter rate per hour: ");
            rate = scan.nextDouble();

            System.out.print("Enter no. of hours worked: ");
            hours = scan.nextInt();
            
            System.out.print("Enter no. of overtime: ");
            overtime = scan.nextInt();
            
            basicPay = rate * hours;
            overtimePay = overtime * (rate * 1.25);
            grossPay = basicPay + overtimePay;
            
            System.out.println("________________________________");
            System.out.println("Employee Name:   " + name);
            System.out.println("Basic Pay:       " + basicPay);
            System.out.println("Overtime Pay:    " + overtimePay);
            System.out.println("________________________________");
            System.out.println("Gross Pay:       " + grossPay);

        } 
        else {
            System.out.print("Invalid input!");
        }
    }
}
