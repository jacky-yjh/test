package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class B {
	public static void main(String[] args) {
Map<String,String> map = new HashMap<String,String>();
		map.put("002", "marry");
		map.put("005", "tom");
		map.put("003", "lucy");
		map.put("006", "lucy");
		map.put("001", "rose");
		map.put("004", "tom");
		
		//map1.keySet()：由map1中的所有的键构成的集合
		for(String k:map.keySet()){
			System.out.println(k+"....."+map.get(k));
		}
		System.out.println("----------------");		
		//利用map.entrySet();进行遍历
		for(Entry<String, String> m :map.entrySet()){
			System.out.println(m.getKey()+"..."+m.getValue());
		}
		System.out.println("----------------");
		Map<String,String> map2 = new TreeMap<String,String>(map);
		for(String k:map2.keySet()){
			System.out.println(k+"....."+map2.get(k));
		}
		System.out.println("---------------------------------");
		//迭代器遍历
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
			System.out.println("key.."+key+"value.."+map.get(key));
		}
		
		System.out.println("---------------------------------");
		Iterator<Entry<String, String>> iterator2 = map.entrySet().iterator();
		while(iterator2.hasNext()){
			Entry<String,String> entry = iterator2.next();
			System.out.println("key.."+entry.getKey()+"value.."+entry.getValue());
		}
		System.out.println("---------------------------------");
		Iterator<String> iterator3 = map.values().iterator();
		while(iterator3.hasNext()){
			String value = iterator3.next();
			System.out.println("value.."+value);
		}
		
		//双列集合还可以转化为单列集合：
		Collection<String> collection = map.values();	
	}
}
