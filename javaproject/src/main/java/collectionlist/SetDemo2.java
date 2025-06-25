package collectionlist;

import java.util.HashSet;
import java.util.Set;

import java.util.*;

public class SetDemo2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashSet<Integer> n = new HashSet<Integer>();      //generic..same datatype
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(40);
		System.out.println(n);
		System.out.println("size is "+n.size());
		System.out.println(n.isEmpty());
		System.out.println(n.contains(10));
		
		HashSet<Integer> n1 = new HashSet<Integer>();
		n1.add(60);
		n1.add(70);
		n1.add(20);
		n1.add(80);
		System.out.println(n1);
		
		n.addAll(n1);
	    System.out.println("addall od set1 and set2 "+n);
	    System.out.println("size is "+n.size());
	    
	    System.out.println(n.containsAll(n1));
	    n.removeAll(n1);
	    System.out.println("after removing n1 elements: "+n);
	    
		
		
		

	}

}
