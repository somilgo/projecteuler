public class Problem4{
	
	
	public static void main (String[] args){
		
		long sumOfSquares = 0L;
		long squareofSums = 0L;
		
		for (int i = 1; i <= 100; i++){
			
			long square = (long) Math.pow(i,2);
			System.out.println(square);
			sumOfSquares += square;
			squareofSums += i;
			
			
		}
		
		squareofSums = (long) Math.pow(squareofSums, 2);
		
		
		
		System.out.println(squareofSums - sumOfSquares);
		
		
		
	}
	
	
}