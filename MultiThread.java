class Itv extends Thread
{
	public void run()
	{
		for(int i=0; i<=7; i++)
		{
			System.out.println(" "+ i + " Abijith_8494");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception ex){}
		}
	}
}
//itvoyagers.in
class Social extends Thread
{
	public void run()
	{
		for(int i=0; i<=7; i++)
		{
			System.out.println(" "+ i + "  Instagram I'd ;)");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception ex){}
		}
	}
}

class MultiThread
{
	public static void main(String[] args)
	{
		Itv itv = new Itv();
		Social socl = new Social();

		itv.start();
		socl.start();
	}
}