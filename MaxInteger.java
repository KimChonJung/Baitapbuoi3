import java.util.Scanner;

public class MaxInteger {
    public static int FindMaxInteger() {
        MaxInteger maxInteger = new MaxInteger();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number1: ");
        int number1= scanner.nextInt();

        System.out.println("Please enter number2: ");
        int number2 = scanner.nextInt();

        System.out.println("Please enter number3: ");
        int number3 = scanner.nextInt();


        int max = number1;
        if( number2 > max){
            max = number2;
        }
         if( number3>number2){
            max = number3;
    }
        return max;
} 
}  
