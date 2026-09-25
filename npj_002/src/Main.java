import java.util.Scanner;

class checking{
    int number;

    checking(int number){
        this.number = number;
    }

    static void checkevenodd(int number){
        if(number%2==0)
        {
            System.out.println(number+" is an even number.");

        }
        else {
            System.out.println(number+" is an odd number.");
        }

    }

}

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = input.nextInt();

        checking.checkevenodd(number);





    }
}