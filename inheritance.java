import java.io.*;

class base{
	int a = 30;
	int b = 40;
	public void printme(){
	System.out.println("this is a base class");
    }
}
class derived extends base{
	int c = a+b;
}
class inheritance{
	public static void main(String args[]){
        derived obj = new derived();
		obj.printme();
        System.out.println("derived class:" + obj.c);
}
}