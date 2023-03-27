import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sw=0;
        double num1 = 0,num2 = 0;
        char operation = 0;
        System.out.println("Following operations are supported : \n1. Addition (+) \n2. Subtraction (-) \n3. Multiplication (*) \n4. Division (/) \n");
        Scanner scanner = new Scanner(System.in);
        while (sw==0) {
            System.out.println("Enter the first number: ");
            num1 = scanner.nextDouble();
            System.out.println("Enter an operator: (+ OR - OR * OR /) ");
            operation = scanner.next().charAt(0);
            System.out.println("Enter the second number: ");
            num2 = scanner.nextDouble();
            if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
                System.out.println("Invalid Operator. Please just enter '+' or '-' or '*' or '/'");
            }
            else sw=1;
        }
        if (operation == '/' && num2 == 0.0) {
            System.out.println("The second number cannot be zero for division operation.");
        }
        switch (operation) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
        }
        MyMath x=new MyMath();
        System.out.println(x.min(15,10));   //10
        System.out.println(x.max(15,10));   //15
        System.out.println(x.pow(2,5)); //32
        System.out.println(x.round(1.6));   //2
        System.out.println(x.round(1.2));   //1
        System.out.println(x.gcd(15,10));   //5
        System.out.println(x.lcm(15,10));   //30
        System.out.println(x.E);    //2.71
        System.out.println(x.PI);   //3.14
    }
}