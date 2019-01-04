package tutorial7;

public class Test14 {
	public static boolean CheckIfPresent(int[] a, int num) {
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==num) {
				return true;
			}
		
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,45,37};
		System.out.println(CheckIfPresent(arr,2));

	}


}
