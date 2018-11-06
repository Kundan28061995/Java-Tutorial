package com.java.Sortalgo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.*;
import java.util.TreeMap;


public class stringblanksort {
	public static void main(String args[]){
		Map<String,String> tmap = new TreeMap<String,String>();
		List<String> dlist = new ArrayList<String>();
		dlist.add("Majesco Mahape");
		dlist.add("Accenture Airoli");
		dlist.add("Capgemini Vikhroli");
		tmap = splitting(dlist);
		display(tmap);
		String[] s;
	}
		
		
		public static Map splitting(List<String> dlist){
		Map<String,String> tmap = new TreeMap<String,String>();
			for(int i=0;i<dlist.size();i++){
				String[] sp = dlist.get(i).split(" ");
				for (int j = 0; j < sp.length-1; j++) {
					tmap.put(sp[j], sp[j+1]);		
				}			
			}
			return tmap;
		}
		public static void display(Map tmap){
			//System.out.println(tmap.keySet());
			System.out.println("\nCOMPANY NAME");
			Object[] key = tmap.keySet().toArray();
			Object[] val = tmap.values().toArray();
			for (int i = 0; i < key.length; i++) {
				System.out.println(key[i]);
			}
			System.out.println("\nCITY");
			for (int i = 0; i < val.length; i++) {
				System.out.println(val[i]);
			}
		}
		
		
		

}
