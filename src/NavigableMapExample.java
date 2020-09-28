import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class NavigableMapExample {
public static void main(String args[])
{
	
	NavigableMap<Integer, String > mapHttpStatus = new TreeMap<Integer, String>();
	mapHttpStatus.put(100, "Continue");
	mapHttpStatus.put(200, "OK");
	mapHttpStatus.put(500, "Internal Server Error");
	mapHttpStatus.put(400, "Bad Request");
	mapHttpStatus.put(501, "Ishan");
	mapHttpStatus.put(401, "Unauthorized");
	
	mapHttpStatus.put(501, "Not Implemented");
	
	/*
	 * System.out.println(mapHttpStatus.keySet());
	 * 
	 * System.out.println(mapHttpStatus.descendingKeySet());
	 * 
	 * 
	 * System.out.println(mapHttpStatus);
	 * System.out.println(mapHttpStatus.descendingMap());
	 */
	
	  System.out.println(mapHttpStatus.floorKey(100));
	  System.out.println(mapHttpStatus.higherKey(501));
	  System.out.println(mapHttpStatus.ceilingEntry(200));
	  System.out.println(mapHttpStatus.firstEntry());
	  System.out.println(mapHttpStatus.lastEntry());
	 
	
	
	
	
	
	
}}