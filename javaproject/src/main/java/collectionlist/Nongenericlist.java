package collectionlist;

import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class Nongenericlist {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List s = new ArrayList();        //non generic...different datatypes
		s.add("apple");
		s.add(2);
		s.add("orange");
		s.add(6.5);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.contains(2));
		
		s.set(1, "mango");
		System.out.println(s);
		
		System.out.println(s.get(2));
		
		
		
		
		
		

	}

}
