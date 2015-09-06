public class Problem3 {
	
	static long bigNumber = 600851475143L;
	
	public static void main (String[] args){
				
		for (int i = 2; i <= bigNumber; i++){
			
			
			if (checker(i)){
				
				if (bigNumber % i == 0){
					
					bigNumber /= i;
					System.out.println(i);
					System.out.println(bigNumber);
					
				}
				
			}
				
				
			
			
		}
		
		
	}
	
	
	public static boolean checker (int i){
		
		
		for (int x = i - 1; x>1; x--){
			
			if (i % x == 0){
				
				return false;
			}
			
		}
		
		return true;
		
	}
}