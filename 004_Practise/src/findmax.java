public class findmax {
    static int maxnumber(int a, int b){
        if(a>b){
            return a;
        }
        else {
            return b;
        }
    }
}
class c6{
    public static void main(String[] args){
        int c = findmax.maxnumber(3,4);
        System.out.println(c);
    }
}
