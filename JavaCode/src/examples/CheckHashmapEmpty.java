package examples;


	import java.util.HashMap;

	public class CheckHashmapEmpty {
	    public static void main(String[] args) {
	        
	        HashMap<String, Integer> map = new HashMap<>();

	        map.put("key1", 6);
	        map.put("key2", 8);
	        map.put("key3", 3);

	        boolean isEmpty = checkEmpty(map);

	        if (isEmpty) {
	            System.out.println("HashMap is empty");
	        } else {
	            System.out.println("HashMap is not empty");
	        }
	    }

	     public static <K, V> boolean checkEmpty(HashMap<K, V> map) {
	        return map.size() == 0;
	    }
	}



