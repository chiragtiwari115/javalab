class finaldemo{
    public final void display(){
        System.out.println("this is final method.");
    }
}
class main extends finaldemo{
    public final void display(){
        System.out.println("the final method is overridenn");
    }
    public static void main(String[] args){
        main t=new Main();
        m.display();
    }
}