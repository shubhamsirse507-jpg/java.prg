import java.io.*;
class operators{
public static void main(String[] args){
int A=10;
int B =20;
boolean X = true;
boolean Y
= false;

//1. arthmatic operator 
System.out.println("A+B="+(A+B));
System.out.println("A-B="+(A-B));
System.out.println("A*B="+(A*B));
System.out.println("A/B="+(A/B));
System.out.println("A%B="+(A%B));

//2.relation operator 
System.out.println("A>B="+(A>B));
System.out.println("A<B="+(A<B));
System.out.println("A==B="+(A==B));
System.out.println("A!=B="+(A!=B));

//3.logical operators
System.out.println("X&&Y"+(X&&Y));
System.out.println("X||Y"+(X||Y));
System.out.println("!X"+(!X));

//4.unary operator
System.out.println("---unary operators----");
int c =5;
System.out.println("c befor increment:"+c);
System.out.println("post-increment c++:"+(c++));;
System.out.println("c after post-increment:"+c);
System.out.println("pre-increment++c:"+(++c));

//5.Assigment operator
System.out.println("\n----Assigment operator-----\n");
int d = 10;
d+=5;
System.out.println("d after += 5 :"+d); 

}
}