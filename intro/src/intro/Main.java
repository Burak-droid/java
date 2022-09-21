package intro;

public class Main {

	
	private static final int srcBegin = 0;
	public static void main(String[] args, int srcEnd) {
	
      System.out.println("Hello world!");
		
      //değişken isimlendirmeleri Java'da camelCase yazılır.
		String ortaMetin ="ilginizi çekebilir";
				String altMetin="Vade süresi";
				
		System.out.println(ortaMetin);	
		System.out.println(altMetin);
		
		int vade = 12;
		
		double dolarDün = 18.85;
		double dolarBugün = 18.95;
		
         boolean dolarDustuMu = false;		
		
		String okYonu = "";
		
		if (dolarBugün<dolarDün) { //true
			okYonu = "down.svg";
			System.out.println(okYonu);
		} 
		
		else if(dolarBugün>dolarDün){
			okYonu = "up.svg";
			System.out.println(okYonu);
			
		}
		else
		{
			okYonu = "equal.svg";
			System.out.println(okYonu);
}
		
		//array
		
		String[] krediler = {
		   "hızlı kredi","maaşını Halkbanktan"
		   ,"Mutlu Emekli"
		};
 //length sayısal olarak kaç elemandan oluşuyor onu bulmaya yardımcı oluyor
		 for (int i = 0; i < krediler.length; i++) {
			 System.out.println(krediler[i]);
	}
		//switch-case
		 char grade ='A';
		 
		    switch (grade) {
			case 'A': 
				System.out.println("Mükemmel : Geçtiniz");
				break;
			
			case 'C':
				  System.out.println("Çok güzel : Geçtiniz");
			break;
		    case 'D':
		    	System.out.println("Fena degil : Geçtiniz");
		    	break;
		    	default:
		    		System.out.println("Geçersiz not girdiniz.");
	}
		   System.out.println("----------------------");
		    
		    //array 
		    
		    String[] students = new String[4];
		    students[0]="Engin";
		    students[1]="Burak";
		    students[2]="Barış";
		    students[3]="Eren";
		    
		    
		    for(int i=0;i<students.length;i++) {
		    	System.out.println(students[i]);
		    }
		    
		    for(String student:students) {
		    	System.out.println(student);
		    }
		    System.out.println("------------------------");
		 
		    //reCap demo 2
		    
		    double[] mylist = {1.2,1.3,4.3,5.6};
		    double total=0;
		    double max = mylist[0];
		    for(double number:mylist) {
		    	if(max<number) {
		    		max = number;
		    	}
		    	total = total+ number;
		    	System.out.println(number);
		    }
		    
		    System.out.println("Toplam ="+total);
		    System.out.println("En büyük = " + max);
		    
		    System.out.println("----------------------");
		    
		    //multi dimensional array
		    
		    String[][] country = new String[3][3];
		    
		    country[0][0]= "İstanbul";
		    country[0][1]= "Bursa";
		    country[0][2]= "Bilecik";
		    country[1][0]= "Ankara";
		    country[1][1]= "Konya";
		    country[1][2]= "Kayseri";
		    country[2][0]= "Diyarbakır";
		    country[2][1]= "Şanlıurfa";
		    country[2][2]= "Gaziantep";
		    
		for(int i =0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.println(country[i][j]);
			}
		}
		
		System.out.println("--------------------");
		
		
	//String demo
		
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		
		System.out.println("Eleman sayısı = "+ mesaj.length());
		System.out.println("5. eleman: " +mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith("."));
		System.out.println(mesaj.endsWith("!"));
        char[] karakterler = new char [5];
        mesaj.getChars( srcBegin: 0, srcEnd: 4,karakterler, dstBegin: 0);
	
	}
}
