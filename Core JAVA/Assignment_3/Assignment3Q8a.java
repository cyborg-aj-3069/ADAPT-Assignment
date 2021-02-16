
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Map.Entry;

	public class Assignment3Q8a {
		public static void failFast(Map<String, String> cityCode) {
		    
			Iterator <Entry<String, String>> hashMapIterator = cityCode.entrySet().iterator();
			while (hashMapIterator.hasNext()) {
			
				System.out.println(hashMapIterator.next());
				cityCode.put("Delhi", "India"); 
			}
		}

		public static void main(String[] args) {

			Map<String, String> obj = new HashMap<>();
			failFast(obj);

		}
	}