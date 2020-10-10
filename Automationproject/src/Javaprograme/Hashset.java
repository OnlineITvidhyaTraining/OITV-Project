package Javaprograme;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {

	Set<String>	value=new HashSet<>();
	value.add("Selenium");
	value.add("Manual");
	value.add("Automation");
	System.out.println(value.size());
	
Iterator i=value.iterator();

while(i.hasNext()){
	System.out.println(i.next());
}

	
		
		
	}

}
