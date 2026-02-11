import java.io.*;
import java.util.Scanner;

public class try45 {

// arthmatic operation and relational operation 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a number:");
        int num = sc.nextInt();
        sc.nextLine(); // consume newline

        int a = num;
        int b = 40;
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int div = (b != 0) ? (a / b) : 0;

        boolean gt = a > b;
        boolean lt = a < b;
        boolean eq = a == b;
        boolean neq = a != b;

        System.out.println(sum + " " + diff + " " + prod + " " + div);   
        System.out.println(gt + " " + lt + " " + eq + " " + neq); 

        //logical operation 
        boolean x = true;
        boolean y = false;
        System.out.println("x && y:" + " " + (x && y));
        System.out.println("x || y:" + " " + (x || y));
        System.out.println("!x" + !x);

        //unary operation
        System.out.println("a++:" + (a++));
        System.out.println("post increment a:" + a);
        System.out.println("a after post increament:" + a);
        System.out.println("pre increment a:" + (++a));
        //Assignment operator
        int p = 10;
        p += 5; //p = p+5
        System.out.println("p after assigmnet operator (p+=5):" + p);
                    
        // looping statments
        for(int o = num; o <= 10; o++){
            System.out.println(num * o); 
        }
        //while loop
        int t = 1;
        while(t <= 10){              // check the condition and then do the work
            System.out.println(num * t);
            t++;
        }
        //do while loop
        int r = 1;
        do{                // do means do the work and then check the condition 
            System.out.println(num / r);
            r++;
        } while(r <= 10);
        System.out.println("do while loop is executed at least once even if the condition is false: " + r);

        // if  else statement
        if (num % 2 == 0){                 
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }

        //nested if else statement 
        if(num == 0) {
            System.out.println("num is zero");
        } else if(num > 0) {
            System.out.println("num is positive");
            }
            else 
            {
            System.out.println("num is negative");
        }
   
        //Exception handling 
        int simpleArr[] = {1,2,3,4,5,6};
        try{
            System.out.println(simpleArr[10]); // This will throw ArrayIndexOutOfBoundsException
        }     
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Array index is out of bound " + ex);
        }
        catch(Exception ex){
            System.out.println("An error occurred: " + ex);
        }   
        finally {
            System.out.println("this block is always excuted");
        }

        // String buffer and string builder
        System.out.println("Enter the a String:");
        String b1 = sc.nextLine();
        StringBuffer sb = new StringBuffer(b1);
        sb.append("2026");
        sb.insert(0, 40); // insert 40 at index 0
        sb.replace(0, 1, "PR");
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        if (sb.length() >= 2) {
            sb.delete(0, 2); //remove index 0 to 2
        }
        //sb.reverse(); //reverse the string
        int sbLen = sb.length();
        String sub = (sbLen >= 5) ? sb.substring(1, 5) : "";
        System.out.println("the final sb: " + sbLen + " " + sb);

        //Initialization of Array
        System.out.println("Enter element's in array:");
        int u1 = sc.nextInt();
        int userArr[] = {u1};
        for(int i = 0; i < userArr.length; i++) // arr.length is used to get the length of array
        {
            System.out.println(userArr[i]);
        }

        //initialization of 2D Array
        int arr2D[][] = {{1,2,3},{4,5,6,7},{8,9,10}};
        for(int i = 0; i < arr2D.length; i++){
            System.out.println("Row " + i);
            for(int j = 0; j < arr2D[i].length; j++) // to print element in each row we use arr[i].length because each row can have different elements
            {   
                System.out.println("Col " + j);
                System.out.println(arr2D[i][j]);
            }
        }
        //for loop
        for(int k = 1; k <= 10; k++){
            System.out.println(k * num);
        }
        //for each loop
        int arr1[] = {1,2,3,4,5,6,7,8,9,0};
        for(int element : arr1) // in for-each loop use the element variable directly
        {
            System.out.println(element);
        }

        sc.close();
    }
}
