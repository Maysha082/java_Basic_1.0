import java.util.Scanner;

public class c3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have licsense: [true/false]");

        boolean reply = input.nextBoolean();

        if (reply){
            System.out.println("You can drive");
        }
        else {
            System.out.println("You can not drive");
        }
    }
}
