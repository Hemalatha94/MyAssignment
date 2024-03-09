package practisehandson;

 public class FabinocciSeries {
	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int r = 8;
		System.out.println(x);
		for(int i=0; i<r; i++) {
			int temp;
			temp = x  + y;
			System.out.println(temp);
			x = y;
			y = temp;
			
			
		}
			
	}

	
}
