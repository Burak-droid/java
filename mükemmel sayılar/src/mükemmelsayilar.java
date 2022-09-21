
public class mükemmelsayilar {

	public static void main(String[] args) {
		
		int number = 5;
		int total =0;
		
		
		for(int i=0;i<number;i++) {
			if(number % i == 0) {
				total =total+i;
			}
		}
		if(total==number) {
			System.out.println("mükemmel sayı");
		}
		else {
			System.out.println("Mükemmel sayı değil.");
		}

	}

}
