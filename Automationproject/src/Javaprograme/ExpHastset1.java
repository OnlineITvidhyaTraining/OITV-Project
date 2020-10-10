package Javaprograme;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExpHastset1 {

	public static void main(String[] args) {

	
		Set value=new HashSet<>();
		value.add("Selenium");
		value.add(100);
		value.add('&');
		System.out.println(value.size());
		
		Iterator x=value.iterator();
		
		while(x.hasNext()){
			System.out.println(x.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
