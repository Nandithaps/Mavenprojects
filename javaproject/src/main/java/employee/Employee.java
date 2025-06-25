package employee;

public class Employee extends Manager
{
	  int bonus = 1000;
	  public void display()
	  {
		System.out.println("Salary with bonus is "+(salary+bonus));  
	  }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Manager e = new Employee();
		e.display();

	}

}
