package tutorial6;

public class Div57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,10,15,7,8,9,14,28,35};
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i] % 5==0 && arr[i] % 7==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
