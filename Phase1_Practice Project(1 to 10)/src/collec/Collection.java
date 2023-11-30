package collec;
import java.util.*;

public class Collection {
	public static void main(String[] args) {
		// arraylist
		System.out.println("ArrayList!!!");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Belagavi");//
	      city.add("Delhi");    	   
	      System.out.println(city);  
		
		// vector
	      System.out.println("\n");
	      System.out.println("Vector!!!");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(1); 
	      vec.addElement(3); 
	      System.out.println(vec);
		
		// linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList!!!");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Rohan");  
	      names.add("Ramesh");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //hashset
	       System.out.println("\n");
	       System.out.println("HashSet!!!1");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       
	       //linked hashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet!!!!");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 
	      }  

}
