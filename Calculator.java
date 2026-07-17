import java.util.*;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addition(a, b);
        System.out.println("Sum of " + a + " and " + b + " is " + sum);

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