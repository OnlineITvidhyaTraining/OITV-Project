package Webdriverprogrames;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampHastset {

	public static void main(String[] args) {

	Set values=new HashSet<>();
		values.add("Selenium");
		values.add(100);
		values.add('@');
		
	System.out.println(values.size());	
	
	Iterator i=values.iterator();
	
	while(i.hasNext()){
		System.out.println(i.next());
	}
	
	
	
	
	
	
	
	
	}

}
