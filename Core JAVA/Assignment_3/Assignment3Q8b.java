import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Assignment3Q8b {
	public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list) {

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			list.add(8);
		}
		return list;
	}

	public static void main(String args[]) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		failFast(list);
	}
}