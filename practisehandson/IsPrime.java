package practisehandson;

public class IsPrime {
	public static void main(String[] args) {
		int n = 13;
		boolean flag = false;
		

		for (int i = 2; i <= n/2; i++) {
			if(n%i==0) {
				flag = true;
				break;
			}
		
			}
		if (!flag) {
			
			System.out.println("Given Number is a Prime");
			
		}
		else {
			
			System.out.println("Given number is a not prime");
		}
//		int count = 0;
//		for (int i = 1; i < n; i++) {
//			if(n%i==0) {
//				count++;
//			}
//			
//		}
//		if(count==2) {
//			System.out.println("Prime Number");
//		}
//		else {
//			System.out.println("Not a prime Number");
//		}
//		
		
		}
}
