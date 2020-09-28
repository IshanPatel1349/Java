import java.util.Collection;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class JavaCollectionSpliteratorExample2 {  
static int i = 1;  
public static void main(String[] args) {  
        Collection<Information> collection = new ConcurrentLinkedQueue();  
        Information val1 = new Information("15", "Reema panda", 21);  
        Information val2 = new Information("16", "Geetanjali Sharma", 21);  
        Information val3 = new Information("17", "Ajeet Kumar Maurya XI", 36);  
collection.add(val1);  
collection.add(val2);  
collection.add(val3);  
Spliterator<Information>str = collection.spliterator();  
long timethen = System.currentTimeMillis();
while (str.tryAdvance((n) ->System.out.println(i++ + " ID No = " + n.idNo+ "\n Name = " + n.name + "\n Age = " + n.age+ "\n")));


          

long timenow = System.currentTimeMillis();

System.out.println("Time Difference in Stream " + (timenow-timethen));
long timethen1 = System.currentTimeMillis();
for(Information i :collection)
{
	System.out.println(i.age +" "+ i.idNo +" "+ i.name);
}
long now1 = System.currentTimeMillis();


System.out.println("Time Difference in Normal  " +(now1-timethen1));

    }  







}

class Information {  
    String idNo, name;  
int age;  
public Information(String idNo, String name, int age) {  
this.idNo= idNo;  
this.name = name;  
this.age= age;  
    }  
}  