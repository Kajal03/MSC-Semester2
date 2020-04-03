import java.util.Random; 
public class ExceptionHandling
{
	public static void main(String args[])
	{
		Random rand = new Random();
		try{ 
			int r = rand.nextInt(3);
			if(r==0)
				System.out.println("No exceptions thrown");
			else if(r==1)
				throw new ArrayIndexOutOfBoundsException();
			else 
				throw new IllegalAccessException();
		   }
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString()+ " caught");
		}
		catch(Exception e)	
		{
			System.out.println(e.toString()+ " caught");
		}
	}
};
