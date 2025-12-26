import java.util.Scanner;
import java.io.*;

public class code8{
    public static void main(String args[]){
       Scanner sc = new Scanner (System.in);
        System.out.println("enter thiree number:");
        int num = sc.nextInt();
        int nu2 =sc.nextInt();
        int nu3 = sc.nextInt();

        if(num>nu2){
            System.out.println("num is greater than nu2"+num);
        }
        else if(nu2>nu3){
            System.out.println("nu2 is greater than nu3"+nu2);
        }
        else if(nu3>num){
            System.out.println("nu3 is grater than num :"+nu3);
        }
        else{
            System.out.println("the grater number is nu3:"+nu3);
        }
    }
}