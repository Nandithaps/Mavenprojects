package collectionlist;

import java.util.HashSet;
import java.util.Set;

import java.util.*;

public class Setmethod 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		s.add("Apples");
		s.add("mango");
		s.add("orange");
		s.add("grapes");
		s.add("banana");
		System.out.println(s);
		System.out.println(s.contains("Apples"));
		s.remove("mango");
		System.out.println(s);
		
		Set<String> s1 = new HashSet<String>();
		s1.add("kiwi");
		s1.add("strawberry");
		s1.add("grapes");
		s1.add("mango");
		System.out.println("-----STRING 2----");
		System.out.println(s1);
		
	    s.addAll(s1);
	    System.out.println("addall od set1 and set2 "+s);
	    
	    System.out.println(s.containsAll(s1));
	    
	    s.removeAll(s1);
	    System.out.println("after removing s1 elements: "+s);
	    
	    
	    
		
		
		
		
		
		
		
		
		

	}

}
