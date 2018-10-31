
// Java code to illustrate StringBuffer 
// class does not implements 
// Comparable interface. 
import java.util.*; 
class TreeSetDemo { 
  
    public static void main(String[] args) 
    { 
        TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>(); 
  
        // Elements are added using add() method 
        ts.add(new StringBuffer("A")); 
        ts.add(new StringBuffer("Z")); 
        ts.add(new StringBuffer("L")); 
        ts.add(new StringBuffer("B")); 
        ts.add(new StringBuffer("O")); 
  
        // We will get RunTimeException :ClassCastException 
        // As StringBuffer does not implements Comparable interface 
        System.out.println(ts); 
    } 
} 
