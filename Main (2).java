class animal{
    public void eat(){
        System.out.println("i can eat");
    }
}
class dog extends animal{
    public void eat(){
        super.eat();
        System.out.println("i eat dog food.");
    }
public void bark(){
    System.out.println("i can bark");
}
}
class Main{
    public static void main(String[]args){
        dog labrador =new dog();
        labrador.eat();
        labrador.bark();
    }
}