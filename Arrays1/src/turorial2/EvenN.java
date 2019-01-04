package turorial2;

public class EvenN {
	public int getEven(int a[]) {
		
		int Even=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				
				Even++;
				System.out.println(a[i]);
				
	
				
			}
		}
		return Even;
		
		
	}

}
