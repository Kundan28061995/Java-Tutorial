package com.java.Sortalgo;

public class sort {
		public static void main(String args[]){
			int a[] = new int[] {10,33,2,55,120,5,8,44,9};
			int result = 0;
			int temp = 0;
	/*		for (int i = 0; i < a.length; i++) {
				a[i]= (int) Math.random()*50+1;
			}*/
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
			for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a.length; j++) {
					if(a[i]>a[j]){
						temp = a[i];
						a[i]=a[j];
						a[j]=temp;
					
				}				
			}
			}
			System.out.println("SORTED ARRAY");
			for (int i = 0; i < a.length; i++) {
				
				System.out.println(a[i]);
			}
		//System.out.println("Highest element"+result);
		}

	}
