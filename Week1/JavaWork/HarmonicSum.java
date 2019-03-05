//Q 12
public class HarmonicSum {
	public static void main(String[] args){
//		Left-to-right
		double sumLTR = 0;
		int n = 50000;
		for (int i = 1; i <= n; i++){
			sumLTR += ((double)1/i);
		}
		System.out.println(sumLTR);
		
//		Right-to - left
		double sumRTL = 0;
		for (int i = n; i >= 1; i--){
			sumRTL += ((double)1/i);
		}
		
		System.out.println(sumRTL);
	}
}
