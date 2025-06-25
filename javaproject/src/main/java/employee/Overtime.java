package employee;

public class Overtime extends Manager
{
	 int ot = 2000;
	  public void display()
	  {
		System.out.println("Salary with overtime is "+(salary+ot));  
	  }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Manager o = new Overtime();
		o.display();

	}
}
