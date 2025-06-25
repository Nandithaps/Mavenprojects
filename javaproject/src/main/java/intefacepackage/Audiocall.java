package intefacepackage;

public class Audiocall implements Whatsappcall 
{
	public void connect()
    {
    	System.out.println("Connecting audio call");
    }
    
    public void disconnect()
    {
    	System.out.println("Disconnecting audio call");
    }
    
    public void mute()
    {
    	System.out.println("Call on mute");
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Audiocall ac = new Audiocall();
		ac.connect();
		ac.disconnect();
		ac.mute();
		
	}

}
