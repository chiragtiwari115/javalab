import java.util.Scanner;
public class question2 {
    public static void main(String[] args){
       System.out.println("taking input from user");
       Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        float a = sc.nextFloat();
      //  int a = sc.nextInt();
        System.out.println("enter number 2");
        float b = sc.nextFloat();
       //int b = sc.nextInt();
           float sum  = a + b;
        System.out.println("sum of these numbers is:");
          System.out.println(sum);
          boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        String str = sc.nextLine();
        System.out.println(str);
    }
}
