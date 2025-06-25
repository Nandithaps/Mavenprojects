package encapsulation;

public class Atm
{
  private int accountno;
  private int pin;
  private int balance;
  
  public void setData(int accountno, int pin, int balance)
  {
	  this.accountno = accountno;
	  this.pin = pin;
	  this.balance = balance;	  
  }
  
  public void getData()
  {
	  System.out.println("Balance is "+balance);
  }
  
}
