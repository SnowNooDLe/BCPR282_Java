
//Exercise 4
public class SumAndAverage {
	//	Loop
	// public static void main (String[] args){
	// 	int sum = 0;
	// 	double average;
	// 	for (int i = 1; i <= 100; i++){
	// 		sum += i;
	// 	}
	// 	average = ((double)sum) / 100;
		
	// 	System.out.println(sum);
	// 	System.out.println(average);
	// }
	
	//	Exercise 5 while-do
	// public static void main (String[] args){
	// 	int sum = 0;
	// 	double average;
	// 	int i = 1;
	// 	while (i <= 100){
	// 		sum += i;
	// 		i++;
	// 	}

	// 	average = ((double)sum) / 100;
		
	// 	System.out.println(sum);
	// 	System.out.println(average);
	// }
	
//	Exercise 6 do-while
	// public static void main (String[] args){
	// 	int sum = 0;
	// 	double average;
	// 	int i = 1;
	// 	do{
	// 		sum += i;
	// 		i++;
	// 	} while (i <= 100);
		

	// 	average = ((double)sum) / 100;
		
	// 	System.out.println(sum);
	// 	System.out.println(average);
	// }
	
//	Exercise 7 sum from 111 to 8989, and compute the average.
	// public static void main (String[] args){
	// 	int sum = 0;
	// 	int count = 0;
	// 	double average;
	// 	int i = 111;
	// 	do{
	// 		sum += i;
	// 		i++;
	// 		count++;
	// 	} while (i <= 8989);
		

	// 	average = ((double)sum) / count;
		
	// 	System.out.println(sum);
	// 	System.out.println(average);
	// }
//	Exercise 8 sum only the odd numbers from 1 to 100 and compute the average
	// public static void main (String[] args){
	// 	int sum = 0;
	// 	int count = 0;
	// 	double average;
	// 	int i = 1;
	// 	do{
	// 		if (i % 2 == 1){
	// 			sum += i;
	// 		}
	// 		i++;
	// 		count++;
	// 	} while (i <= 100);
		

	// 	average = ((double)sum) / count;
		
	// 	System.out.println(sum);
	// 	System.out.println(average);
	// }
	
//	Exercise 9 Sum those numbers from 1 to 100 that is divisible by 7, and compute the average
	// public static void main (String[] args){
	// 	int sum = 0;
	// 	int count = 0;
	// 	double average;
	// 	int i = 1;
	// 	do{
	// 		if (i % 7 == 0){
	// 			sum += i;
	// 		}
	// 		i++;
	// 		count++;
	// 	} while (i <= 100);
		

	// 	average = ((double)sum) / count;
		
	// 	System.out.println(sum);
	// 	System.out.println(average);
	// }
	
//	Exercise 10 to find the "sum of the squares" of all the numbers from 1 to 100
	public static void main (String[] args){
		int sum = 0;
		int count = 0;
		double average;
		int i = 1;
		do{
			sum += i * i;
			i++;
			count++;
		} while (i <= 100);
		

		average = ((double)sum) / count;
		
		System.out.println(sum);
		System.out.println(average);
	}
	
}
