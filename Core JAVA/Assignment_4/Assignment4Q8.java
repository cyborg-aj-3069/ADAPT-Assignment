import java.util.*;
import java.util.function.Consumer;

public class Assignment4Q8 implements Runnable{
	public static void main(String[] Args) {
		Assignment4Q8 obj = new Assignment4Q8();  
        Thread t1= new Thread(obj);  
        t1.start();   
        List<String> list = new ArrayList<>();
        list.add("Alpha");
        list.add("Bravo");
        list.add("Charlie");
        
        obj.print.accept(list);
	}
	
	Consumer<List<String>> print = list -> {
		for (String s : list) {
			 System.out.println(s); 
		}
	};

	@Override
	public void run() {
	}
}