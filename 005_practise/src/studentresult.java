public class studentresult {
    String studentname;
    double bangla;
    double english;
    double math;

    double calculateavg(double bangla, double english, double math){
        double number=(bangla+english+math)/3;
        return number;

    }
    String findgrade(double number){
        if(number>=80){
            return "A+";
        }
        else if(number>=70){
            return "A";
        }
        else if(number>=60){
            return "B";
        }
        else if(number>=50){
            return "C";
        }
        else {
            return "F";
        }
    }
}
class c3{
    public static void main(String[] args){
        studentresult s1 = new studentresult();
        s1.studentname="maysha";
        s1.bangla = 80.0;

        double result = s1.calculateavg(80, 80, 80);
        String grade = s1.findgrade(result);
        System.out.println(result);
        System.out.println(grade);

    }
}
