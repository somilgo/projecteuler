public class Problem7 {
	
	public static void main (String[] args){
		
		int count = 0;
		long answer = 0;
		
		for (long s = 2; count<10001; s++){
			
			if (checker(s)){
				
				answer = s;
				System.out.println(answer);
				count++;
							
			}
			
		}
		
		System.out.println(answer);
		System.out.println("Done");
		
		
		
	}
	
	public static boolean checker (long i){
			
			
			for (long x = i - 1; x>1; x--){
				
				if (i % x == 0){
					
					return false;
				}
				
			}
			
			return true;
			
		}
	
}