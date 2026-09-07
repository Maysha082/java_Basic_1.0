import java.util.Scanner;
public class table {
    int number;
    int i;
    int result;

    void takeinput(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        number = input.nextInt();
    }
    void  showtable(){
        for(i=1; i<=10; i++){

            result = number * i;
            System.out.println(  number + "*" + i + " =" +  result );


        }
    }

}
class c1{
    public static void main(String[] args){

        table t1 =new table();

        t1.takeinput();
        t1.showtable();
    }
}
