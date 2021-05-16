package lab6;
import java.util.*;


public class Ex1 {
	@SuppressWarnings("unchecked")
	public static List sortByValue(HashMap<String, Integer> map) {
			 
		List list = new LinkedList(map.entrySet());
		      
		        Collections.sort(list, new Comparator() {
		             public int compare(Object obj1, Object obj2) {
		                return ((Comparable) ((Map.Entry) (obj1)).getValue()).compareTo(((Map.Entry) (obj2)).getValue());
		             }
		        });
				return list;
			
		}

		public static void main(String[] args) {
			
			HashMap<String, Integer> map = new HashMap<>();

	        map.put("A", 3);
	        map.put("B", 18);
	        map.put("C", 20);
	        
	        List<?> list = sortByValue(map);
	        System.out.println(list);
	        
		}
}



