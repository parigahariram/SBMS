package Test;

public class Car {
	
	public void drive()
	{
		Engine eng= new Engine();
		int status = eng.start();
		
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
