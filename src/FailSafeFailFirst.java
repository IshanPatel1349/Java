import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeFailFirst {
public static void main(String[] args) {
ConcurrentHashMap<Integer,String> ch = new ConcurrentHashMap<Integer,String>();
ch.put(1, "Sabya");
ch.put(2, "Ranjhna");
ch.put(3, "Bauaa");
ch.put(4, "Naved");
Iterator itr = ch.keySet().iterator();
while (itr.hasNext())
{
int key = (Integer) itr.next();
System.out.println(key+"……."+ch.get(key));

ch.remove(3);
ch.remove(2);
System.gc();
ch.put(19, "Sonal");
}
}
}