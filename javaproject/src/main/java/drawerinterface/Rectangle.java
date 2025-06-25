package drawerinterface;

public class Rectangle implements Drawer, Printable
{
    public void draw()
    {
    	System.out.println("Draws rectangle");
    }
    
    public void print()
    {
    	System.out.println("Print rectangle");
    }
    
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Rectangle rc = new Rectangle();
		rc.draw();
		rc.print();

	}

}
