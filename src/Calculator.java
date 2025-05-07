import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public int add (int a, int b) {
        return a + b;
    }

    public double add (double a, double b) {
        return a + b;
    }

    public double add(double[] a) {
        double result = 0;
        for (double el : a){
            result += el;
        }
        return result;
    }

    public int subtract (int a, int b) {
        return a - b;
    }

    public void devision () {
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        try {
            System.out.println("The result is: "+ 10/a);
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception don't divide by zero.");
        }catch (InputMismatchException e){
            System.out.println("Input Mismatch enter only numbers.");
        }catch (Exception e){
            System.out.println("Exception caught. Something went wrong, "+e.getMessage());
        }

    }
}
