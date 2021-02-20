import java.util.*;

public class Assignment4Q7 {
	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Alpha", 1);
		hashMap.put("Bravo", 2);
		hashMap.put("Charlie", 3);

		Assignment4Q7 obj = new Assignment4Q7();

		System.out.println(obj.convertKeyValueToString(hashMap));

	}

	public String convertKeyValueToString(HashMap<String, Integer> map) {
		StringBuffer buffer = new StringBuffer();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			buffer.append(entry.getKey());
			buffer.append(entry.getValue());
		}
		return buffer.toString();

		

	}
}