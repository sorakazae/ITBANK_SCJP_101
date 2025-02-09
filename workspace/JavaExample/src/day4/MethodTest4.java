package day4;

public class MethodTest4 {

	public static void main(String[] args) {
		int nums[] = new int[args.length];
		for(int i=0; i<args.length; i++){
			nums[i] = Integer.parseInt(args[i]);
		}
		printArray(nums);
		updateArray(nums);
		printArray(nums);         // nums는 아규먼트 (전달하는 변수)
		}
	public static void updateArray(int su[]){
		for(int i=0; i<su.length; i++)
			su[i] = su[i]*2;

	}
	public static void printArray(int su[]){        // su는 매개변수(받는 변수)
		for(int element : su)
			System.out.print(element+"\t");
		System.out.println();
	}

}
