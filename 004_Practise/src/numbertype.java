public class numbertype {
    static String checknumber(int a){
        if(a>0){
            return "positive";
        }
        else if(a<0) {
            return "negative";
        }
        else{
            return "zero";
        }
    }
}
class c7{
    public static void main(String[] args){
         String b = numbertype.checknumber(3);
         System.out.println(b);
    }
}
