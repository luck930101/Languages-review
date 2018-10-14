import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;



public class HashMaps {
	/*
	 *HashMap和Hashtable的区别
	 *HashMap和Hashtable都实现了Map接口，但决定用哪一个之前先要弄清楚它们之间的分别。主要的区别有：线程安全性，同步(synchronization)，以及速度。
	 *HashMap几乎可以等价于Hashtable，除了HashMap是非synchronized的，并可以接受null(HashMap可以接受为null的键值(key)和值(value)，而Hashtable则不行)。
	 *HashMap是非synchronized，而Hashtable是synchronized，这意味着Hashtable是线程安全的，多个线程可以共享一个Hashtable；而如果没有正确的同步的话，多个线程是不能共享HashMap的。Java 5提供了ConcurrentHashMap，它是HashTable的替代，比HashTable的扩展性更好。
	 *另一个区别是HashMap的迭代器(Iterator)是fail-fast迭代器，而Hashtable的enumerator迭代器不是fail-fast的。所以当有其它线程改变了HashMap的结构（增加或者移除元素），将会抛出ConcurrentModificationException，但迭代器本身的remove()方法移除元素则不会抛出ConcurrentModificationException异常。但这并不是一个一定发生的行为，要看JVM。这条同样也是Enumeration和Iterator的区别。
	 *由于Hashtable是线程安全的也是synchronized，所以在单线程环境下它比HashMap要慢。如果你不需要同步，只需要单一线程，那么使用HashMap性能要好过Hashtable。
	 *HashMap不能保证随着时间的推移Map中的元素次序是不变的。
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HashMap :");    
		Map<String, String> map=new HashMap<String, String>();                
		map.put("a", "aaa");    
		map.put("b", "bbb");    
		map.put("c", "ccc");    
		map.put("d", "ddd");  
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			 
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());  
		 
		}
            
         Iterator iterator = map.keySet().iterator();                
         while (iterator.hasNext()) {    
          Object key = iterator.next();    
          System.out.println("map.get(key) is :"+map.get(key));    
         }    
         System.out.println("map.containsKey(c): "+map.containsKey("c"));
         System.out.println("map.containsKey(e): "+map.containsKey("e"));
         
         System.out.println();
 		 System.out.println("Hashtable :");         
         Hashtable tab=new Hashtable();                
         tab.put("a", "aaa");    
         tab.put("b", "bbb");    
         tab.put("c", "ccc");    
         tab.put("d", "ddd");    
         Iterator iterator_1 = tab.keySet().iterator();    
         while (iterator_1.hasNext()) {    
          Object key = iterator_1.next();    
          System.out.println("tab.get(key) is :"+tab.get(key));    
         }   
         
         
         System.out.println();
 		 System.out.println("TreeMap :");  
         TreeMap tmp=new TreeMap();                
         tmp.put("a", "aaa");    
         tmp.put("b", "bbb");    
         tmp.put("c", "ccc");    
         tmp.put("d", "ddd");    
         Iterator iterator_2 = tmp.keySet().iterator();    
         while (iterator_2.hasNext()) {    
          Object key = iterator_2.next();    
          System.out.println("tmp.get(key) is :"+tmp.get(key));    
         }    
         
        System.out.println();
 		System.out.println("HashMap :");    
 		Map<String, Integer> countmap=new HashMap();                
 		countmap.put("a", 1); 
 		countmap.put("a", countmap.get("a")+2); 
 		countmap.put("b", 2);    
 		countmap.put("c", 3);    
 		countmap.put("d", 4);    
             
 		Iterator countmapiterator = countmap.keySet().iterator();                
 		while (countmapiterator.hasNext()) {    
 			Object key = countmapiterator.next();    
 			System.out.println(key+": map.get(key) is :"+countmap.get(key));    
          }  
 		
        System.out.println();
 		System.out.println("HashMap :");    
 		Map<Integer, Integer> countmap2=new HashMap();                
 		countmap2.put(2, 1); 
 		countmap2.put(12, 2); 
 		countmap2.put(2, 2);    
 		countmap2.put(3, 3);    
 		countmap2.put(1, 4);    
             
 		Iterator countmapiterator2 = countmap2.keySet().iterator();                
 		while (countmapiterator2.hasNext()) {    
 			Object key = countmapiterator2.next();    
 			System.out.println(key+": map.get(key) is :"+countmap2.get(key));    
          } 
 		
        System.out.println();
 		System.out.println("HashMap :");    
 		Map<String[], Integer> countmap3=new HashMap();    
 		String[] st={"a","b"};
 		countmap3.put(st, 3); 
  
             
 		Iterator countmapiterator3 = countmap3.keySet().iterator();                
 		while (countmapiterator3.hasNext()) {    
 			Object key =  countmapiterator3.next();    
 			System.out.println(Arrays.toString((String[])key)+": map.get(key) is :"+countmap3.get(key));    
          }  
         
         

	}

}