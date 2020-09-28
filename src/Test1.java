
public class Test1 { 
 public static void foo() { 
     System.out.println("100"); 
 } 
 public static void foo(int a) {  
     System.out.println("2000"); 
 } 
 public static void main(String args[]) 
 {  
     Test1.foo(); 
     Test1.foo(10); 
 } 
}