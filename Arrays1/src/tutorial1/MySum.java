package tutorial1;

public class MySum {
	
	public int getSum(int a[]) {
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}

}
