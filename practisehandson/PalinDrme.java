package practisehandson;

public class PalinDrme {
	public static void main(String[] args) {
		int input = 121;   
		int reverse = 0;
		int temp ;
		
		temp = input;
		
		for (; input!=0; input=input/10) { //121/10
			
			reverse=reverse*10 + input%10;
		}
		
		if (reverse==temp) {
			
			System.out.println("Palindrome nuMBER");
			
		}
//		String l = input.length();
//		hw to find length
//		for(int i=0 ;i;i++) {
//			int temp = input;   
//			int y = temp%10; 
//			int z = temp/10; 
//			reverse = 0 *10 + y;
//			temp = z;
//			
//		}
//		
	}
}
