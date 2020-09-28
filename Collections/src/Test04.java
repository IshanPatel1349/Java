
class Test04 { 
    public static void main(String[] args) 
    { 
        Thread t = new Thread(); 
        Object o = new Object(); 
        String s = new String("GEEKS"); 
  
        System.out.println(t == o); 
        System.out.println(o == s); 
  
       // Uncomment to see error  
      System.out.println(t==s); 
    } 
}