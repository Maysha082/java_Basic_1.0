public class rectangle {
    int length;
    int width;

    void calculatearea(){

        System.out.println(length * width);

    }
}
class c1{
    public static void main(String[] args){
        rectangle r1 = new rectangle();
        r1.length = 10;
        r1.width =5;
        r1.calculatearea();
    }
}
