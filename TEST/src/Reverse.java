
public class Reverse {
	public static void main(String args[]){
		int a = 12345,rem =0,n=0;
		while (a > 0){
			n = a % 10;
			a = a/10;
			rem = rem*10 + n;
		}
	System.out.println("Reverse:"+rem);
	
	int x = 10, y=20;
	swap(x,y);
	}
	
	public static void swap(int a , int b){
		System.out.println(a +" "+b);
		a=a+b;b=a-b;a=a-b;
		System.out.println(a +" "+b);
	}
}
