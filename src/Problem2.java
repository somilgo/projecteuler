public class Problem2{
	
	
	public static void main(String[] args){
		
		int newNumb = 1;
		int lastNumb = 1;
		int sum = 0;
		
		while (newNumb <= 4000001){
			
			
			int nextNumb = newNumb + lastNumb;
			//System.out.println(newNumb);
			
			if (nextNumb % 2 == 0){
				
				sum += nextNumb;
				
			}
			
			lastNumb = newNumb;
			newNumb = nextNumb;
			System.out.println(sum);
			
			
			
		}
		
	}
	
}