
import java.util.*;


public class collectionEG {
	public static void main(String args[]) {
		System.out.println("LIST");
		List<Integer> dlist = new ArrayList<Integer>();
		dlist.add(12);
		dlist.add(222);
		dlist.add(133);
		System.out.println(dlist);
		dlist.remove(1);
		System.out.println(dlist);
		System.out.println(dlist.size());
		String s[] = new String[20];
		System.out.println(s.length);
		
		System.out.println("\nHASHMAP");
		Map<Integer,String> dmap =new HashMap<Integer,String>();
		//dmap.put(null, "temp");
		dmap.put(2,"kundan");
		System.out.println(dmap.hashCode());
		dmap.put(3,"Panchal");
		dmap.put(1,"Manisha");
		System.out.println(dmap.keySet());
		System.out.println(dmap.get(1)+ " " +dmap.get(2)+" "+dmap.get(3)+" "+dmap.get(null));
		
		System.out.println("\nHASHTABLE");
		Hashtable<Integer, String> dtable = new Hashtable<Integer, String>();
		//dtable.put(null, "temp");
		dtable.putAll(dmap);
		System.out.println(dtable);
		
		
		Set<String> dset = new HashSet<String>();
		dset.add("MAJESCO NAVI");
		dset.add("ACCENTURE AIROLI");

		
	}

}
