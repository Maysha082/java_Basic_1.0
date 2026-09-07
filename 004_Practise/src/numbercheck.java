public class numbercheck {
    static boolean iseven(int a){
        return a % 2 == 0;
    }
}
class c5{
    public static void main(String[] args){
        boolean result = numbercheck.iseven(8);
        System.out.println(result);
    }
}
