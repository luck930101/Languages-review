import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;



public class HashMaps {
	/*
	 *HashMap��Hashtable������
	 *HashMap��Hashtable��ʵ����Map�ӿڣ�����������һ��֮ǰ��ҪŪ�������֮��ķֱ���Ҫ�������У��̰߳�ȫ�ԣ�ͬ��(synchronization)���Լ��ٶȡ�
	 *HashMap�������Եȼ���Hashtable������HashMap�Ƿ�synchronized�ģ������Խ���null(HashMap���Խ���Ϊnull�ļ�ֵ(key)��ֵ(value)����Hashtable����)��
	 *HashMap�Ƿ�synchronized����Hashtable��synchronized������ζ��Hashtable���̰߳�ȫ�ģ�����߳̿��Թ���һ��Hashtable�������û����ȷ��ͬ���Ļ�������߳��ǲ��ܹ���HashMap�ġ�Java 5�ṩ��ConcurrentHashMap������HashTable���������HashTable����չ�Ը��á�
	 *��һ��������HashMap�ĵ�����(Iterator)��fail-fast����������Hashtable��enumerator����������fail-fast�ġ����Ե��������̸߳ı���HashMap�Ľṹ�����ӻ����Ƴ�Ԫ�أ��������׳�ConcurrentModificationException���������������remove()�����Ƴ�Ԫ���򲻻��׳�ConcurrentModificationException�쳣�����Ⲣ����һ��һ����������Ϊ��Ҫ��JVM������ͬ��Ҳ��Enumeration��Iterator������
	 *����Hashtable���̰߳�ȫ��Ҳ��synchronized�������ڵ��̻߳���������HashMapҪ��������㲻��Ҫͬ����ֻ��Ҫ��һ�̣߳���ôʹ��HashMap����Ҫ�ù�Hashtable��
	 *HashMap���ܱ�֤����ʱ�������Map�е�Ԫ�ش����ǲ���ġ�
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HashMap :");    
		Map map=new HashMap();                
		map.put("a", "aaa");    
		map.put("b", "bbb");    
		map.put("c", "ccc");    
		map.put("d", "ddd");    
            
         Iterator iterator = map.keySet().iterator();                
         while (iterator.hasNext()) {    
          Object key = iterator.next();    
          System.out.println("map.get(key) is :"+map.get(key));    
         }    
         
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
