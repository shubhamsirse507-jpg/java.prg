import java.util.*;

class VectorDemo
{
    public static void main(String args[])
    {
        Vector<String> vector1 = new Vector<>();

        vector1.addElement("123");
        vector1.addElement("11");
        vector1.addElement("ABC");
        vector1.addElement("75");
        vector1.addElement("b");

        System.out.println("Vector array is: " + vector1);
        System.out.println("Capacity of vector = " + vector1.capacity());
        System.out.println("Contains '11' = " + vector1.contains("11"));
        System.out.println("Element at index 2 = " + vector1.elementAt(2));
        System.out.println("First element = " + vector1.firstElement());
        System.out.println("Last element = " + vector1.lastElement());
        System.out.println("Index of ABC = " + vector1.indexOf("ABC"));

        vector1.insertElementAt("PCP", 2);
        System.out.println(vector1);

        vector1.removeElementAt(1);
        System.out.println(vector1);

        System.out.println(vector1.removeElement("b"));
        System.out.println("Size of vector = " + vector1.size());

        String arr[] = new String[vector1.size()];
        vector1.copyInto(arr);

        for(String ch : arr)
        {
            System.out.println(ch);
        }

        System.out.println("Pattern:");
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        Enumeration<String> e = vector1.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
