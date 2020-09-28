import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountCharacter {
	public static void main(String[] args) {
		String result="MUuuKESHKUMARYADAV";
		String s= result.toUpperCase( );     ///if you want change Higher to lower than .toLowerCase();
		List<Object> list=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			list.add(ch);
		}
		Set<Object> hs=new HashSet<>(list);
		System.out.println(hs);
		for(Object o:hs) {
			System.out.println(o+":"+ Collections.frequency(list,o));
		}
	}

}