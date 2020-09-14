
public class AmountInCoins {

	public static void main(String[] args) {
		int amount=288;
		int n,rem;
		n=amount/100;
		rem=amount%100;
		n=n+rem/25;
		
		rem=rem%25;
		n=n+rem/10;
		
		rem=rem%10;
		n=n+rem;
		System.out.println("Total coins will be = "+n);

	}

}
