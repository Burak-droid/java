import java.util.Iterator;

public class Hello_world {

	public static void main(String[] args) {
		
		//Variables
		int studentNumbers = 17; 
		double studentNumber = 17.25;
		String Mesaj ="Öğrenci sayısı : ";
		//output
           System.out.println("Hello World");
           System.out.println(studentNumbers);
           System.out.println(studentNumber);
    System.out.println(Mesaj + studentNumbers);
    
          int number = 20;
          //if - else if
          if(number<20) {
        	  System.out.println("lower than 20");
          }
          else if(number>20) {
        	  System.out.println("Bigger than 20");
          }
          else {
        	  System.out.println("Number equals to 20");
          }
          
          char grade = 'A';
          //switch case 
          switch(grade) {
          
          case 'A':
        	  System.out.println("grade is " + grade);
        	  break;
        	  
          case 'B':
        	  System.out.println("grade is not"+grade);
        	  break;
          }
          
          
          //for loop
          int n = 5;
          // for loop  
          for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
          }
          
          //while loop
          int i=1;  
          while(i<=10){  
              System.out.println(i);  
          i++;  
          }  
          
	
	     //do-while loop

          int j=1;    
          do{    
              System.out.println(j);    
          j++;    
          }while(j<=10);    
	
	
          
           
	
	
	
	
	
	
   }
}
