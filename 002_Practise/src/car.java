public class car {
    String colour;
}
class car1{
    public static void main(String[] args){
        car c1 = new car();
        car c2 = new car();

        c1.colour = "Black";
        c2.colour = "blue";

        System.out.println(c1.colour);
        System.out.println(c2.colour);
    }
}
