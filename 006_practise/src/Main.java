import java.util.Scanner;
class student{
    String name;
    double mark;

    void takeinput(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter name");
         name = input.nextLine();


        System.out.println("Enter mark");
         mark = input.nextDouble();
    }


   void showresult(){
        System.out.println(name);
        if(mark>=80){
            System.out.println("A+");
        }
        else if(mark>=70 ){
            System.out.println("A");
        }
        else if(mark>=60){
            System.out.println("B");
        }
        else if(mark>=50 ){
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }

    }
}

public class Main {
    public static void main(String[] args){


       student s1 =new student();
       s1.takeinput();
       s1.showresult();



    }
}

