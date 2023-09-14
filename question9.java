//chirag tiwari
//0827CI221047
import java.util.Scanner;
public class question9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter the number : ");
        a = sc.nextInt();
        int num = a;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}