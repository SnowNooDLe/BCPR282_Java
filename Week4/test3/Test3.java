package test3;

public class Test3 {
	
	public int[] ReverseArray(int[] intArray) {
		this.reverse(intArray);

		return intArray;
		
	}
	
	public void reverse(int[] intArray) {
//		int type of variable SCOPE 1 & 1 primitive types***
		int i = 0;
//		Constant
		final int arrayLength = intArray.length;
//		System.out.println(intArray.length / 2 - 1);
		while(i < (arrayLength / 2)) {
//			getting temporary values to swap
			int tempFirst = intArray[i];
			int tempLast = intArray[arrayLength - (i + 1)];
//			System.out.println("Temp values");
//			System.out.println(tempFirst);
//			System.out.println(tempLast);
//			System.out.println("-------");
			
//			swapping
			intArray[arrayLength - i - 1] = tempFirst;
			intArray[i] = tempLast;
			
//			increment as its while loop
			i++;
		}
//		System.out.println("New Array is");

//		Testing list
//		for (int j = 0; j < intArray.length; j++) {
//			System.out.println(intArray[j]);
//		}
	}
}
