class test{
    String name ="Rahim";

    static  void show(test obj){
        System.out.println(obj.name);
    }
}
public class Main {
    public static void main(String[] args){
        test t1 = new test();
        test.show(t1);
    }
}