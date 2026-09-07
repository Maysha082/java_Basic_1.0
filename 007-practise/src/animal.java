public class animal {
    void eat(){
        System.out.println("it is eating");
    }
}
class  dog extends animal{
    void bark(){
        System.out.println("it is barking");
    }
}
class c1{
    public static void main(String[] args){
        dog d1 = new dog();
        d1.bark();
        d1.eat();
    }
}