import java.util.ArrayList;
import java.util.List;

public class Al {
	
	
	public static void main(String args[])
	{
		methodA();
	}
	private static void methodA()
	{

	List<String> list =new ArrayList<String>();
	list.add("String1");
	list.add("string2");

	printSize(list);

	}  static void printSize(List<?> list){


	 System.out.print(list.size());
	 
	}
	}


