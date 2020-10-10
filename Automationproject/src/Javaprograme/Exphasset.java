package Javaprograme;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exphasset {

	public static void main(String[] args) {

		
		
	Set 	value=new HashSet<>();
	value.add("Selenium");
	value.add("Automation");
	value.add("Manual");
	value.add(100);
	value.add('@');
	System.out.println(value.size());
	
	Iterator i=value.iterator();

	while(i.hasNext()){
		System.out.println(i.next());
	}
	
	
	
	
	
	
	
	
		
		
	}

}
