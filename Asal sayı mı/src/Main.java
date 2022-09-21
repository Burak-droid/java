
public class Main {

	public static void main(String[] args) {
		
		int number = 23;
		int remainder = number % 2;
		//System.out.println(remainder);
		//it is just like flag.
		boolean isPrime = true;
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isPrime=false;
			}
	}
if(isPrime) {
	System.out.println("sayı asaldır.");
}
else {
	System.out.println("sayı asal değildir.");
}

	}

}
