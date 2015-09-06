public class Problem5 {
	
	
	public static void main (String[] args){
		
		
		boolean cont = true;
		int start = 2520;
		
		while (cont){
			
			boolean cont2 = true;
			
			while(cont2){
				
				start += 1;
				
				for (int i = 1; i <= 20; i++){
					
					if (start % i == 0){
						
						if (i == 20){
							
							System.out.println(start);
							cont = cont2 = false;
							
						}
						
					}
					
					else {
						
						break;
					}
					
				}
				
			}
			
		}
		
		
	}
	
}