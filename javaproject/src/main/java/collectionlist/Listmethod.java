package collectionlist;

import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class Listmethod 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("grape");
		fruits.add("orange");
		System.out.println(fruits);
		System.out.println(fruits.get(1));
		
		fruits.set(1, "grape");
		System.out.println(fruits);
		
		System.out.println(fruits.indexOf("grape"));
		System.out.println(fruits.lastIndexOf("grape"));
		
		fruits.remove("orange");
		System.out.println(fruits);
		
		System.out.println(fruits.size());
		
		System.out.println(fruits.contains("apple"));
		
		System.out.println(fruits.isEmpty());
		
		fruits.clear();
		
		System.out.println(fruits);
		System.out.println(fruits.isEmpty());
		
		
		
		
		
		
		
		
		
		
		

	}

}
