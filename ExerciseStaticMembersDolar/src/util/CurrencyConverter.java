package util;

public class CurrencyConverter {
	
	public double reaisPayment;
	
	public static double payment(double dollarPrice, double dollarBought) {
		double reaisPayment = dollarPrice * dollarBought + (dollarPrice * dollarBought * 0.06);
		return reaisPayment;
				
	}
}
