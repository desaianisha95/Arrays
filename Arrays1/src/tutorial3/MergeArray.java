package tutorial3;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {1,2,3};
		int[] a2= {4,5,6};
		int[] a3= new int[a1.length+a2.length];
		int index=0;
		for(int i=0; i<a1.length;i++) {
			a3[index]=a1[i];
			index++;
		}
		for(int j=0; j<a2.length;j++) {
			a3[index]=a2[j];
			index++;
		}
		for(int k=0;k<a3.length;k++)
		System.out.println(a3[k] + " ");

	}

}
