package Test;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws Exception{
		
//       BillCollector bc= new BillCollector();
//		injecting CreditCard object into BillCollector(Setter Injection)
//		bc.setPayment(new CreditcardPayment());
//		bc.collectPayment(1400.00);
//
//      injecting CreditCard object into BillCollector(Constructor Injection)
//		BillCollector bc1=new BillCollector(new DebitcardPayment() );
//		bc1.collectPayment(1500.00);
	
		//field injecting
//		CreditcardPayment ccd= new CreditcardPayment();
//		bc.payment  =ccd;
//		bc.collectPayment(2000.00 );
		
		//if class is private access this way to collect private data
//		Class<?> cls = Class.forName("Test.BillCollector");
//		
//		Field field = cls.getDeclaredField("payment");
//		field.setAccessible(true);
//
//		Object obj = cls.newInstance();
//		field.set(obj, new CreditcardPayment());//Injecting value to variable
//
//		BillCollector bc=(BillCollector)obj;
//		bc.collectPayment(205.00);
		
		//dependent  class obj
		CreditcardPayment ccd = new CreditcardPayment();
		//target class obj
		BillCollector bc= new BillCollector();
		bc.setPayment(ccd);
		bc.collectPayment(200.00);
	  }

} 
