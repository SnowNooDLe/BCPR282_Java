//Q 11
public class Product1toN {
	public static void main(String[] args){
//		Compute the product of integers 1 to 10 (ie 1x2x3x4x5....x10)
		int total = 1;
		int uptoNum = 10;
		for (int i = 1; i <= uptoNum; i++){
			total *= i;
		}
		
		System.out.println(total);
	}
}
