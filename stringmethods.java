import java.util.Scanner;

public class stringmethods{
    public stringmethods(){
    }
    public static void main(String[] name0)
    {
      Scanner name1 = new Scanner(System.in);
      System.out.println("Enter a string:");
      String name = name1.nextLine();
      int value = name.length();
      System.out.println(value);
      String uString = name.toUpperCase();//for upper case
      System.out.println(uString);
      String lString =  name.toLowerCase();//for lower case
      System.out.println(lString);
      System.out.println("Enter a string to trim:");
      Scanner nontrimmedString1= new Scanner(System.in);
      String nontrimmedString = nontrimmedString1.nextLine();
      System.out.println(nontrimmedString.trim());//o/p is"Shubham"
      System.out.println("Enter number Begin Index no:");
      Scanner BeginIndex1 = new Scanner(System.in);
      String BeginIndex = BeginIndex1.nextLine();//End index 
      System.out.println("Enter End Index no:");
      Scanner EndIndex1 = new Scanner(System.in);
      String EndIndex =EndIndex1.nextLine();
      System.out.println(name.substring(value));
      System.out.println(name.substring(value));
      String s = BeginIndex + EndIndex;
      System.out.println("final String is :"+s);//substring is for last char of name.
      // replacement of name and sentance 
      //System.out.println(name.replace('S','s'));
      System.out.println("Enter string to replace:");
      Scanner name2 = new Scanner(System.in);
      System.out.println(name.replace("Enter name","Enter name to replaace "));//enter string to replace
    }
}  