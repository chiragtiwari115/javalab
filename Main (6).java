//constructor chaining
class Main{
    int sum;
    Main(){
        this(5,2);
    }
    Main(int a1,int a2){
        this.sum=a1+a2;
    }
    void display(){
        System.out.println("sum is:"+sum);
    }
    public static void Main(String[]args){
        Main o=new Main();
        o.display();
    }
}