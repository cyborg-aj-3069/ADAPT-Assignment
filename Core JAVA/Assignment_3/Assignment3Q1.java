import java.util.Set;
import java.util.TreeSet;
import java.lang.Comparable;

class Person implements  Comparable<Person>{
    private String name;
    private int height;
    private double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Person p) {
        if(weight > p.weight){
            return 1;
        }else if(weight < p.weight)
        {
            
            return -1;
        }
        else
        {
            if(height > p.height){
                
                return 1;
            }
            else if(height< p.height)
            {
                
                return -1;
            }else 
            {
                return 0;
            }
        }
    }
}

public class Assignment3Q1 {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<Person>();
        Person p1 = new Person("Aman", 171, 77);
        Person p2 = new Person("Aarav", 162,74 );
        Person p3 = new Person("Atharv", 184, 74);
        

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        for(Person p: persons ){
            System.out.println(p.getName()+ " Height = "+ p.getHeight() + " weight = "+ p.getWeight());
        }

    }
}
