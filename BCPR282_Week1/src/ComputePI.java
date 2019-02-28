
public class ComputePI {
	public static void main(String[] args){
//		program to compute the value of pi
		double piValue = 1;
		int count = 1;
		do{
			if (count % 4 == 1){
				piValue += (double)1/(double)count;
			}
			else if (count % 4 == 3){
				piValue -= (double)1/(double)count;
			}
			count++;
		}while (piValue <= (Math.PI / (double)4));
		System.out.println(piValue * 4);
		System.out.println(Math.PI);
	}
}
