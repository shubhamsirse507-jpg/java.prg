import java.util.Scanner;

public class code6 {
    public code6(){
    }
    public static void main(String[] sub0)
    {
        Scanner b= new Scanner(System.in);
        System.out.println("Enter a number to compare:");
        int b2 = b.nextInt();
        int a = 67; 
        if (b2>a)
        {
            System.out.println("B is greater than a:");
        }
        else if (b2==a)
        {
            System.out.println("b2 is equal to :"+a);
        }
        else
        {
            System.out.println("a is greater than b2:)");
        }
    }
}