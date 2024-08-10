package in.ashokit;

public class CreditcardPayment implements IPayment {

	public CreditcardPayment()
	{
		System.out.println("CreditcardPayment Constructor");
	}
	public String pay(double amount) {
		// TODO Auto-generated method stub
		return "CreditcardPaymentSuccessFully";
	}

}
