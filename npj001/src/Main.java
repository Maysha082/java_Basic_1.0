import java.util.Scanner;

class addition{
    int num1, num2;

    static int addNumber(int num1, int num2){
        return num1+num2;
    }

}
public class Main {
    public static void main(String[] args){


        Scanner input= new Scanner(System.in);



        System.out.println("Enter first number: ");
        int num1= input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Sum: "+ addition.addNumber(num1, num2));



    }


}

/* Problem 1: Addition of Two Numbers

Write a Java program that takes two integer numbers as input from the user.

Create a static method named addNumbers() that receives the two numbers as parameters and returns their sum.

Call the method from the main() method and display the result.

Method Signature
static int addNumbers(int number1, int number2)
Sample Output
Enter the first number: 10
Enter the second number: 20
Sum: 30
*/
