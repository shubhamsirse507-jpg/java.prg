import java.io.*;
 class StringBufferMethodsDemo { 
    public static void main(String[] args) { 
        StringBuffer sb = new StringBuffer("Java"); 
        System.out.println("Original StringBuffer: " + sb); 
 
        // 1. append(String str) - Appends the specified string to the end 
        sb.append(" Programming"); 
        System.out.println("\n1. After append: " + sb + ""); 
 
        // 2. insert(int offset, String str) - Inserts the string at a specific position 
        sb.insert(5, "is fun "); 
        System.out.println("2. After insert: " + sb + ""); 
 
        // 3. replace(int startIndex, int endIndex, String str) - Replaces characters in a range 
        sb.replace(0, 4, "Python"); 
        System.out.println("3. After replace: " + sb + ""); 
 
        // 4. delete(int startIndex, int endIndex) - Deletes a portion of the string 
        sb.delete(6, 12); // Deletes "is fun" 
        System.out.println("4. After delete: " + sb + ""); 
 
        // 5. reverse() - Reverses the characters within the buffer 
        sb.reverse(); 
        System.out.println("5. After reverse: " + sb + ""); 
 
        // 6. capacity() - Returns the current capacity of the buffer 
        StringBuffer sb2 = new StringBuffer(); 
        System.out.println("\n6. Default capacity of new StringBuffer: " + sb2.capacity() +""); 
 
        // 7. length() - Returns the length (character count) of the buffer 
        System.out.println("7. Length of current sb: " + sb.length() + ""); 
         
        // Convert to a String 
        String finalString = sb.toString(); 
        System.out.println("8. Converted to String: " + finalString + ""); 
    } 
}