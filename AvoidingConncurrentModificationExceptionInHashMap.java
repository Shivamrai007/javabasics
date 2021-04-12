import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AvoidingConncurrentModificationExceptionInHashMap {

	public static void main(String[] args) {
		
		
		
		try {
			hashMapDemo();
		} catch (ConcurrentModificationException e) {
			System.out.println(e);
		}
		
		
		concurrentHashMapDemo();
	}

	public static void hashMapDemo() {
		System.out.println("HashMap :");
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("2")) {
				// myMap.put("1", "4");
				myMap.put("4", "4");
			}
		}
	}
	
	public static void concurrentHashMapDemo() {
		System.out.println("\nConcurrentHashMap : ");
		Map<String, String> myMap = new ConcurrentHashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("2")) {
				// myMap.put("1", "4");
				myMap.put("4", "4");
			}
		}

	}
}
