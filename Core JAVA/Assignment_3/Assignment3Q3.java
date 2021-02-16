import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment3Q3 {
public static List traverseReverse(ArrayList<String> aList)
    {
    	 ArrayList<String> newArrayList = new ArrayList<String>(); 
         for (int i= aList.size()-1;i>=0;i--) 
         { 
             newArrayList.add(aList.get(i)); 
         }
	     	return newArrayList;
	}
    public static void main(String[] args) 
    {
    	
    }
}
