package drawerinterface;

public class Square implements Drawer, Printable 
{
	public void draw()
    {
    	System.out.println("Draws square");
    }
	
	public void print()
    {
    	System.out.println("Print square");
    }
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Square sq = new Square();
		sq.draw();
		sq.print();
		

	}

}
