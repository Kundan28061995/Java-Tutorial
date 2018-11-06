package com.java.Sortalgo;
import java.util.Arrays;
import java.util.Random;

class QuickSort{
	
	public void quickSort(int[] arr){
		quickSort(arr,0,arr.length-1);
	}
	
	private void quickSort(int[] arr,int startIndex,int lastIndex){
		if(startIndex < lastIndex+1){
			int p = partition(arr,startIndex,lastIndex);
			quickSort(arr,startIndex,p-1);
			quickSort(arr,p+1,lastIndex);
		}
	}
	
	private void swap(int[] arr,int index1,int index2){
		int temp = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
	
	//returns random pivot index between low & high inclusive
	private int getPivot(int startIndex,int lastIndex){
		return new Random().nextInt((lastIndex-startIndex)+1)+startIndex;
	}
	
	//Moves all n < pivot to left of pivot and all n > pivot
	//to right of pivot, then returns pivot index.
	private int partition(int[] arr,int startIndex,int lastIndex){
		swap(arr,startIndex,getPivot(startIndex,lastIndex));
		int border = startIndex+1;
		for(int i=border;i<=lastIndex;i++){
			if(arr[i] < arr[startIndex]){
				swap(arr,i,border++);
			}
		}
		swap(arr,startIndex,border-1);
		return border-1;
	}
	
	public static void main(String[] args){
		QuickSort qs=new QuickSort();
		int[] A={45,67,3,89,9,1,0,45};
		System.out.println(Arrays.toString(A));
		qs.quickSort(A);
		System.out.println(Arrays.toString(A));
	}
	
}