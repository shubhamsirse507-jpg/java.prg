 import java.util.Scanner;

public class code2{
    public code2(){

    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner (System.in);
 System.out.println("Entre u:");
   float u= sc.nextInt();
   System.out.println("Entre s:");
   float  s= sc.nextInt();
   System.out.println("Entre v:");
   float v=sc.nextInt();
   System.out.println("Entre a:");
   float a = sc.nextInt();
   float b= v*v- u*u / 2*a*s;
   System.out.println(b);
    }
}