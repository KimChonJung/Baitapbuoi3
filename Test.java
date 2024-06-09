import java.util.Scanner;

public class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.CalculatorInteger("+",4,2);
        calculator.CalculatorInteger("-",4,2);
        calculator.CalculatorInteger("*",4,2);
        calculator.CalculatorInteger("/",4,2);
        calculator.CalculatorInteger("/",4,0);

        System.out.println("----------------------------------");

        CheckYear checkYear = new CheckYear();
        checkYear.CheckLeapYear(2020);
        checkYear.CheckLeapYear(2013);
        checkYear.CheckLeapYear(1000);

        
        System.out.println("----------------------------------");

        MaxInteger maxInteger = new MaxInteger();
        int max = maxInteger.FindMaxInteger();
        System.out.printf("So lon nhat la: %d \n",max);
    
        System.out.println("----------------------------------");

        Equation equation = new Equation();
        equation.CalculateQuadratic();
    }  
}


