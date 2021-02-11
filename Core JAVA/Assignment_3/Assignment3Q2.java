import java.util.*;
public class Assignment3Q2 {
    public static void main(String[] args) {


    }
    public static LinkedHashSet ordered(LinkedHashSet linkedHashSet){
        LinkedHashSet<Integer> linked = new LinkedHashSet();
        linked.add(1);
        linked.add(5);
        linked.add(3);
        linked.add(4);
        linked.add(2);
        Iterator<Integer> i=linked.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        return linkedHashSet;
    }
    public static HashSet unordered(HashSet hashSet){
        HashSet<Integer> unlinked=new HashSet();
        unlinked.add(1);
        unlinked.add(5);
        unlinked.add(3);
        unlinked.add(4);
        unlinked.add(2);
        Iterator<Integer> i=unlinked.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        return hashSet;
    }
}