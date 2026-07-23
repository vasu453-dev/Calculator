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
        int squareA = square(a);
        int maximum = maximum(a, b);
        int minimum = minimum(a, b);
        int squareRoot = squareRoot(a);
        int APlusBWholeSquare = APlusBWholeSquare(a , b);
        int gcd = gcd(a, b);
        System.out.println("Addition of " + a + " and " + b + " is " + sum);
        System.out.println("Difference of " + a + " and " + b + " is " + diff);  
        System.out.println("Multiplication of " + a + " and " + b + " is " + mul);
        System.out.println("Division of " + a + " and " + b + " is " + div);
        System.out.println("Square of "+a+" is "+squareA);
        System.out.println("Minimum of "+a+" and "+b+" is "+minimum);
        System.out.println("Maximum of "+a+" and "+b+" is "+maximum);  
        System.out.println("Square Root of "+a+" is "+squareRoot);    
        System.out.println("APlusBWholeSquare of "+a+" and "+b+" is "+APlusBWholeSquare);  
        System.out.println("GCD of "+a+" and "+b+" is "+gcd); 

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
    public static int square(int a){
        return a * a;
    }
    public static int maximum(int a , int b){
        return Math.max(a , b);
    }
    public static int minimum(int a , int b){
        return Math.min(a , b);
    }
    public static int squareRoot(int a){
        return (int) Math.sqrt(a);
    }
    public static int APlusBWholeSquare(int a , int b){
          return (a + b) * (a + b);
    }
    public static int gcd(int a , int b){
        return (b == 0) ? a : gcd(b , a % b);
    }
}