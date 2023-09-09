import java.util.Scanner;
public class question5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an alphabet:");
        char ch = sc.next().charAt(0);
        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            System.out.println(" this alphabet is a vowel");
        }else {
            System.out.println(" this alphabet is a consonant");
        }
    }
}