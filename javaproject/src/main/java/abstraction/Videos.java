package abstraction;

public class Videos extends Google
{
    void search()
    {
    	System.out.println("Searching from videos");
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Videos vi = new Videos();
		vi.search();
		vi.messagedisplay();

	}

}
