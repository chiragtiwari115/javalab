class parent{
     void display(){
        System.out.println("this is a parent class.");
     }
    void show(int num){
        System.out.println("the number in parent class is: "+num);
    }
 }
 class child extends parent{
     void display(){
         System.out.println("this is child class.");
     }
     void show(double num){
         System.out.println("the number in the chuild class is: "+num);
     }
 }
 public class Main{
     public static void main(String[]args){
         parent parent=new parent();
         child child=new child();
         parent.show(5);
         child.show(7.75);
         
         parent.display();
         child.display();
     }
 }