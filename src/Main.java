import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        fizzBuzzChallenge();
//        mortgageChallenge();
//        fibonacciChallenge();
//        twoDimensionArrayChallenge();
//        diagonalSumOfTwoDArrayChallenge();
//        diagonalSumOfTwoDArrayChallenge();
//        System.out.println(scramble("apple"));
//        scrambleGameChallenge();
//        System.out.println(validateEmail());
//        System.out.println("the factorial result is: " + factorial(5));
//
//        Laptop laptop = new Laptop();
//        Calculator calculator = new Calculator();
//        calculator.division();
//        double[] array = {1, 3, 4, 5, 5, 6};
//        System.out.println("Method overloading: " +calculator.add(array));
//        System.out.println("Method overloading: " +calculator.add(2,5));
//
//        CreditCardPayment creditCardPayment = new CreditCardPayment();
//        creditCardPayment.processPayment();
//
//        Telephone telephone = new Telephone();
//        telephone.turnOff();
//        telephone.getStatus();
//        telephone.turnOn();
//        telephone.getStatus();

//        FileSystem fileSystem = new FileSystem();
//        fileSystem.writeDateInFile();

//        User user = new User();
//        try {
//            user.userRegistration("Evariste Dux", "password");
//            user.userRegistration("Eva", "");
//        }catch (Exception e){
//            System.out.println("Error from main class");
//            System.out.println(e.getMessage());
//        }
//        Engine manualEngine = new Engine();
//        Car manualCar = new Car(manualEngine);
//        manualCar.drive();
        TypeChecker<String> stringPrinter = new TypeChecker<>("Hello generics");
        TypeChecker<Double> doublePrinter = new TypeChecker<>(123.423);
        stringPrinter.displayType();
        doublePrinter.displayType();

//        BOUNDED TYPE SAFETY

        NumberChecker<Integer> intNumber = new NumberChecker<>(123);   //this works fine
        intNumber.print();

//        NumberChecker<String> stringValue = new NumberChecker<>("Hello bounded types");   //this won't work fine
//        intNumber.print();

//        GENERIC METHOD CALL
        Integer[] arr ={1,3,5,5,7,4};

        swapArrayElement(arr, 0, arr.length-1);



    }

    //        GENERIC METHOD

    public static <T> void swapArrayElement(T[] array, int index1, int index2){
        System.out.println("Array before swap: "+ Arrays.toString(array));
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        System.out.println("Array after swap: "+ Arrays.toString(array));

    }
    //        FIZZBUZZ CHALLENGE
    public static void fizzBuzzChallenge(){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0)
            System.out.println("FizzBuzz");
        else if (num % 5 == 0)
            System.out.println("Fizz");
        else if (num % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(num);
        sc.close();
    }

    //        MORTGAGE PAYMENT CALCULATION
    public static void mortgageChallenge() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Loan amount: ");
        int amount = sc.nextInt();
        System.out.print("Enter Annual Interest Rate: ");
        double interestRate = sc.nextDouble();
        System.out.print("Enter Period(years): ");
        int numberOfPayment = sc.nextInt() * 12;
        double monthlyInterestRate = interestRate / (12 * 100);

        double mortgage = amount *
                (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayment)) /
                ((Math.pow((1 + monthlyInterestRate), numberOfPayment) - 1));

        System.out.println("Monthly payment is: " + NumberFormat.getCurrencyInstance().format(mortgage));
        sc.close();
    }

    public static void fibonacciChallenge(){
        int firstNumber = 0, secondNumber = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        sc.close();
        if(n == 1){
            System.out.println(firstNumber);
        }else {
            System.out.print(firstNumber + " " + secondNumber);
            for (int i = 3; i <= n; i++) {
                int nextNumber = firstNumber + secondNumber;
                System.out.print(" " + nextNumber);
                firstNumber = secondNumber;
                secondNumber = nextNumber;

            }
            System.out.println();
        }
    }

    public static void twoDimensionArrayChallenge(){
        int[][] twoDimensionArray = {{1,2},{3,4,5}};

        int sum = 0;

        for (int i = 0; i < twoDimensionArray.length; i++) {
            for (int j = 0; j < twoDimensionArray[i].length; j++) {
                sum += twoDimensionArray[i][j];
            }
        }
        System.out.println("Sum is: "+sum);
    }

    public static void diagonalSumOfTwoDArrayChallenge(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int primarySum = 0;
        int secondarySum = 0;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element of matrix: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];
            secondarySum += matrix[i][n - 1 - i];
        }
        System.out.println("Sum of primary diagonal is: "+primarySum);
        System.out.println("Sum of second diagonal is: "+secondarySum);
        System.out.println(Arrays.deepToString(matrix));
    }

//    SCRAMBLE GAME

    public static void scrambleGameChallenge(){
        String[] words = {"apple", "banana", "cherry", "elderberry", "fig", "grape"};
        int random = (int) Math.ceil(Math.random() * words.length -1);
        System.out.println("Random number: " + random);
        Scanner sc = new Scanner(System.in);
        System.out.println("Rearrange this word: "+scramble(words[random]));
        System.out.println("Enter collect word: ");
        String collectWord = sc.nextLine();
        while (!Objects.equals(collectWord, "")) {
            if (Arrays.asList(words).contains(collectWord)) {
                System.out.println("Yes you did it, the collect word is: "+ collectWord);
                break;
            }else {
                System.out.println("Try again");
                System.out.println("Enter collect word: ");
                collectWord = sc.nextLine();
            }
        }
        sc.close();

    }

    public static  String scramble(String word){
        Random random = new Random();
        char[] letters = word.toCharArray();
//        scramble letters and join them back
        for (int i = letters.length - 1; i > 0; i--) {
            int index = random.nextInt(letters.length);
            System.out.println(index);
            char temp = letters[index];
            letters[index] = letters[i];
            letters[i] = temp;
        }
       return new String(letters);
    }

//    VALIDATE EMAILS

    public static boolean validateEmail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email address: ");
        String email = sc.nextLine();

        return isEmailValid(email);

    }

    public static boolean isEmailValid(String email){
        int atSymbolCount = 0;

        for (int letter : email.toCharArray()) {
            if (letter == '@') atSymbolCount++;
        }
        if (atSymbolCount != 1) {
            System.out.println("Your email address is invalid");
            return false;
        };

        if (email.indexOf('@') < 1 || email.indexOf('@') == email.length() - 1){
            System.out.println("Your email address is invalid");
            return false;
        }
        String domainPart = email.substring( email.indexOf("@") + 2);

        if (!domainPart.contains(".")){
            System.out.println("Your email address is invalid");
            return false;
        }

        if (email.indexOf('.') < 1 || email.indexOf('.') == email.length() - 1){
            System.out.println("Your email address is invalid");
            return false;
        }


        return true;
    }

//    FACTORIAL RECURSION

    public static int factorial(int n){
        if (n == 1 || n == 0) return 1;
        return n * factorial(n -1);
    }

}