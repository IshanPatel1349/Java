class MyClass
{
 static int i;
 static
 {
  i=10;
 }
}

class Ideone
{
 public static void main (String[] args) throws java.lang.Exception
 {
  // your code goes here
  MyClass mc=new MyClass();
  System.out.println(mc.i);
 }

}