package Test;

public class Car extends Engine{
	
	public void drive()
	{
		int status = super.start();
		
		if(status >=1)
		{
			System.out.println("journey Started....");
		}
		else
		{
			System.out.println("Engine Having some problem..");
		}
	}
}
