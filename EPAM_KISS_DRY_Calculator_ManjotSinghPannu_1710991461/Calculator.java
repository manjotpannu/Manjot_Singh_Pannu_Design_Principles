import java.util.*;

public class Calculator {
	
	public static double add(double a,double b){
	return a+b;
	}
	
	public static double subtract(double a,double b){
	return a-b;
	}
	
	public static double multiply(double a,double b){
	return a*b;
	}
	
	public static double divide(double a,double b){
	return a/b;
	}

    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
       
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        double result;
        switch(operator)
        {
            case '+':
                result = add(first,second);
                break;
            case '-':
                result = subtract(first,second);
                break;
            case '*':
                result = multiply(first,second);
                break;
            case '/':
                result = divide(first,second);
                break;
            
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}