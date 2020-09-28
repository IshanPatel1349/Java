import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class _HashTable {

	public final static void main(String[] args) {

Hashtable<Integer,String> hp = new Hashtable<>();

hp.put(1, "Ishan");
hp.put(1,"Ishan");
hp.contains(2);
Enumeration<Integer> emr = hp.keys();

while(emr.hasMoreElements())
{
	System.out.println(hp.get(emr.nextElement()));
}
System.out.println(hp.size());
System.out.println(hp.containsKey(1));

HashMap<Integer,String> mp = new HashMap<Integer,String>();
mp.put(1, "Ishan");
mp.put(null,"Ishan");
mp.get(null);
//mp.set

}

}
