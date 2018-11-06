package com.java.Sortalgo;

public class mergesort {
	public static void main(String args[]){
		int temp =0;
		int a[] = new int[]{5,55,44,23,10};
		int b[] = new int[]{8,59,77,66,33};
		int c[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				
			}
				if(b[i]>b[j]){
					temp = b[i];
					b[i]=b[j];
					b[j]=temp;
				}
		}
		}
		System.out.println("sorted array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);	
		}
		System.out.println(" \n  ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);	
		}
		
		for(int i=0;i<a.length;i++){
			for (int j = 0; j < b.length; j++) {
				if(a[i] > b[j]){
					c[i]=a[i];
					break;
				}
				else{
					c[i]=b[j];
				}
			}
		}
		System.out.println("FINAL ARRAY");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);	
		}

	
	}}
