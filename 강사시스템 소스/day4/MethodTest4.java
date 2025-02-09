package day4;
public class MethodTest4 {
	public static void main(String[] args) {
		int nums[] = new int[args.length];
		for(int i=0; i<args.length; i++) {
			nums[i] = Integer.parseInt(args[i]);
		}	
		printArray(nums);			
		updateArray(nums);		
		printArray(nums);	
	}
	public static void updateArray(int su[]){
		for(int i=0; i < su.length; i++)
			su[i] = su[i] * 2;		
	}
	public static void printArray(int su[]){
		for(int element : su)
			System.out.print(element+"\t");	
		System.out.println();	
	}
}
