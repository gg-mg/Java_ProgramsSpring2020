import java.util.Scanner;

public class TryItOut {
    public static void main(String[] args) {
        int hours = 8;
        double salary = 0.0, rate = 5.00;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours worked(0-40):");
        hours = input.nextInt();
        while (hours < 0 || hours > 40) {
            System.out.print("Re-enter hours worked(0-40):");
            hours = input.nextInt();
        }
        salary = hours * rate;
        System.out.printf("Salary:$%5.2f\n ", salary);
    }

}