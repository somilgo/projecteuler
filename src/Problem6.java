public class Problem6 {
	
	
	public static void main (String[] args){
		
		int lettuce = 0;
		int tomato = 0;
		int bread = 0;
		
		for(int i=999; i>100; i--){
			
			for(int j=999; j>100; j--){
				
				lettuce = i * j;
				int meat = lettuce;
				tomato = 0;
				while(lettuce != 0){
					
					tomato = tomato * 10;
					tomato = tomato + (lettuce % 10);
					lettuce = lettuce / 10;
					
					
				}
				
				if (tomato == meat && meat > bread){
					bread = meat;
					
				}
				
				
			}
						
		}
		
		System.out.println(bread);
		
	}
	
	
}