
public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int inputNumber = 100;
          
          for(int i = 1; i <= inputNumber; i++){
                 
                  boolean isPrime = true;
                 
                  for(int j=2; j < i ; j++){
                         
                          if(i % j == 0){
                                  isPrime = false;
                                  break;
                          }
                  } if(isPrime){
                	  
                	  System.out.print(i + " ");
	                 }
          }
	}
}

   

