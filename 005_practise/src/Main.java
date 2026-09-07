class student{
    String name;
    int age;

    void showinfo(){
        System.out.println(name +","+ age);
    }
}
public class Main {
    public static void main(String[] args){
        student s1 = new student();
        s1.name="maysha";
        s1.age=22;
        s1.showinfo();
    }
}