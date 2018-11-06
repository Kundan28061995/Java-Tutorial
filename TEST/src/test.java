
public class test {
	public static void main(String args[]){
		int a[] = new int[] {10,33,2,55,120,5,8,44,9};
		int result = 0;
/*		for (int i = 0; i < a.length; i++) {
			a[i]= (int) Math.random()*50+1;
		}*/
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		result = a[0];
		for (int j = 1; j < a.length; j++) {
			if(result > a[j]){
				result = a[j];
			}
		}
	System.out.println("Highest element"+result);
	}

}
