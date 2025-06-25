package string;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java";
		System.out.println(s.concat("project"));
		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer("Hello");
		System.out.println("original string is "+s1);
		s1.append("world");
		System.out.println(s1);
		
		int a =10;
		int b = 5;
		int c = 20;
		String s2 = String.valueOf(a);
		System.out.println(a+b);
		System.out.println(a+s2);
		System.out.println(c+b);
		
		
	}

}
