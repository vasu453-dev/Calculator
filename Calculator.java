import java.util.*;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addition(a, b);
        int diff = subtraction(a, b);
        int mul = multiplication(a, b);
        int div = division(a, b);
        System.out.println("Addition of" + a + " and " + b + " is " + sum);
        System.out.println("Difference of " + a + " and " + b + " is " + diff);  
        System.out.println("Multiplication of " + a + " and " + b + " is " + mul);
        System.out.println("Division of " + a + " and " + b + " is " + div);
        sc.close();
    }
    public static int addition(int a , int b){
        return a  + b;
    }
    public static int subtraction(int a , int b){
        return a - b;
    }
    public static int multiplication(int a , int b){
        return a * b;
    }
    public static int division(int a , int b){
        return (b == 0) ? 0 : a / b;
    }
}