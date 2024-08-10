package in.ashokit;

public class BillCollector {
	
	private IPayment payment;
	
	public void setPayment(IPayment payment) {
		System.out.println("SetMthod :: is Executed");
		this.payment = payment;
	} 
//	public BillCollector()
//	{
//		
//	}
	public BillCollector(IPayment payment)
	{
		System.out.println("BillCollector :: Executed");
		this.payment=payment;
	}
	
	public void collectPayment(double amount)
	{
		System.out.println("Injected"+payment.getClass().getName());
		 String status = payment.pay(amount);
		 
		 System.out.println(status);
	}
}
  