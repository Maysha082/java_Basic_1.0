public class bankaccount {
    String accountholder;
    double balance = 1000;

    void deposite(double amount){
        balance = balance+amount;
        System.out.println("balance:" + balance);
    }
    void withdreaw(double amount){
        if(balance<amount){
            System.out.println("insufficient");

        }
        else {
            balance = balance- amount;
            System.out.println("balance:" + balance);

        }

    }
}
class c2{
    public static void main(String[] args){
        bankaccount a1 = new bankaccount();
        a1.accountholder= "maysha";
        a1.deposite(500);
        a1.withdreaw(700);
        a1.withdreaw(1000);


    }
}
