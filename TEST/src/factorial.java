
public class factorial {
public static void main(String args[]){
	int fact=0;
	
	fact = factorialno(5);
	System.out.println(fact);
}
public static int factorialno(int n){
	if(n==0){
		return 1;
	}
	else{
		return factorialno(n-1)*(n);
	}
}
}

