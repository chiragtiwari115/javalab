//chirag tiwari
//0827CI221047
import java.util.Scanner;
public class question11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter the value of a");
        a = sc.nextInt();
        int b;
        System.out.println("enter the value of b");
        b = sc.nextInt();
        int n1=a, n2=b;
        while(n1!=n2)
        {
            if(n1>n2)
                n1=n1-n2;
            else
                n2=n2-n1;
        }
        System.out.printf("GCD of n1 and n2 is: " +n2);
    }  }