import java.util.Scanner;
public class twodimentionalloop{
    
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr=new int[3][3];
    System.out.println("enter a element:");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
    arr[i][j]= sc.nextInt();
    }
    }
      System.out.println ("your array is ");
      for(int i=0;i<3;i++){
        System.out.println("\n");
        for(int j=0;j<3;j++){
        System.out.println(arr[i][j]+" ");
        }
      }
    }
}