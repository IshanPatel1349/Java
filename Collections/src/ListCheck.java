import java.util.ArrayList;
import java.util.List;

public class ListCheck {
	
	public static void main(String args[])
	{
		
		
		M1();
		
	}
	
	private static void M1()
	{
	ArrayList list = new ArrayList();
	list.add("a");
	list.add("b");
	M2(list);
	System.out.println(list.size());
	}

	static void M2(List list){
	list.add("c");
	list.add("d");
	}
	
	

}
