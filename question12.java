//chirag tiwari
//0827CI221047
import java.util.Scanner;
class question12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("enter a number to reverse");
        a = in.nextInt();
        int num = a, reversed = 0;
        System.out.println("Original Number: " + num);
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
